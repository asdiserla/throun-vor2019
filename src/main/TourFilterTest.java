package main;

import controller.TourController;
import model.Tour;
import model.TourFilter;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class TourFilterTest {


    @org.junit.Before
    public void setUp() throws Exception {
        //mock gagnagrunnur búa til 3 ferðir sem má leita í
    }

    @org.junit.After
    public void tearDown() throws Exception {
        //eyða draslinu?
    }

    @org.junit.Test
    public void correctSerchTest(){
        //Þetta próf á að skila réttri ferð
        System.out.println("baby girl");
        /**
         * serch á að skila ferð sem er til í gagnagrunni ef skilyrðin
         * eru uppfyllt. Bera saman ferðina sem við fáum og það em við vildum fá.
         *
         * Byrjum á að búa til tour object.
         * Leitum.
         * Berum saman.
         */
        TourFilter inputFromUser = new TourFilter(/*Búum til input frá notanda*/);


        Tour found = TourController.search(inputFromUser);

        assertEquals(inputFromUser, found);

    }


    @org.junit.Test
    public void failedSerchTest(){
        //Þetta próf á að skila
        System.out.println("baby girl");
    }

    @org.junit.Test
    public void errorSerchTest(){
        System.out.println("baby girl");
    }

}
