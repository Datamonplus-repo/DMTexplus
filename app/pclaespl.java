package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaespl extends GXProcedure
{
   public pclaespl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaespl.class ), "" );
   }

   public pclaespl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pclaespl.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pclaespl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaespl.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaespl.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaespl.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaespl.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaespl.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaespl.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaespl.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaespl.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaespl.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaespl.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaespl.this.AV113Opi = aP11[0];
      this.aP11 = aP11;
      pclaespl.this.AV115BarFactin = aP12[0];
      this.aP12 = aP12;
      pclaespl.this.AV116Clave_PQ = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      AV114Opcion3 = GXutil.substring( AV16Clave, 1, 3) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV15Descrip ;
         GXv_char3[0] = AV16Clave ;
         GXv_int4[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char9[0] = AV22PrdDesc ;
         GXv_char10[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int12[0] = AV113Opi ;
         new app.pclaaf(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char9, GXv_char10, GXv_int11, GXv_int12) ;
         pclaespl.this.A396EmprCod = GXv_char1[0] ;
         pclaespl.this.AV15Descrip = GXv_char2[0] ;
         pclaespl.this.AV16Clave = GXv_char3[0] ;
         pclaespl.this.AV17PrdVal = GXv_int4[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char9[0] ;
         pclaespl.this.AV23Accion = GXv_char10[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int12[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "RB", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char9[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char3[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclarb(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char7, GXv_int12, GXv_int5, GXv_int6, GXv_char3, GXv_decimal8, GXv_char2, GXv_char1, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char10[0] ;
         pclaespl.this.AV15Descrip = GXv_char9[0] ;
         pclaespl.this.AV16Clave = GXv_char7[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char3[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespl.this.AV23Accion = GXv_char1[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AR", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char9[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char3[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclaar(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char7, GXv_int12, GXv_int5, GXv_int6, GXv_char3, GXv_decimal8, GXv_char2, GXv_char1, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char10[0] ;
         pclaespl.this.AV15Descrip = GXv_char9[0] ;
         pclaespl.this.AV16Clave = GXv_char7[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char3[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespl.this.AV23Accion = GXv_char1[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MQ", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char9[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char3[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclamqtl(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char7, GXv_int12, GXv_int5, GXv_int6, GXv_char3, GXv_decimal8, GXv_char2, GXv_char1, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char10[0] ;
         pclaespl.this.AV15Descrip = GXv_char9[0] ;
         pclaespl.this.AV16Clave = GXv_char7[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char3[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespl.this.AV23Accion = GXv_char1[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TC", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char9[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char3[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char13[0] = AV115BarFactin ;
         new app.pclatc1(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_char7, GXv_int12, GXv_int5, GXv_int6, GXv_char3, GXv_decimal8, GXv_char2, GXv_char1, GXv_int11, GXv_int4, GXv_char13) ;
         pclaespl.this.A396EmprCod = GXv_char10[0] ;
         pclaespl.this.AV15Descrip = GXv_char9[0] ;
         pclaespl.this.AV16Clave = GXv_char7[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char3[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespl.this.AV23Accion = GXv_char1[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char13[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TN", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclatn(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TM", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclatm(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AC", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclaac(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "PR", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV116Clave_PQ ;
         new app.pclaprq(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV116Clave_PQ = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IT", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclait(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CL", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclacl(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TP", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclatp(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IF", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclaif(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MM", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclamm(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C1", "")) == 0 ) && ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "C1 ", "")) == 0 ) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclac1(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C2", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclac2(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C3", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac3(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C4", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac4(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C5", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac5(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C6", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac6(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C7", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac7(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C8", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclac8(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C9", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac9(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "C10", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac10(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "C11", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclac11(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "C12", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclac12(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "FS", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclafs(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "C13", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         new app.pclac13(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR0", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqs(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR1", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqc(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR2", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqta(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR3", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_int4[0] = AV113Opi ;
         GXv_char1[0] = AV115BarFactin ;
         new app.pclamqi(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11, GXv_int4, GXv_char1) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV113Opi = GXv_int4[0] ;
         pclaespl.this.AV115BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR4", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqf(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR5", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqcl(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR6", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamqtp(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR7", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclaamet(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CR8", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_int11[0] = AV67BarLinMaq ;
         GXv_char3[0] = AV23Accion ;
         new app.pclamtec(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_int11, GXv_char3) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
         pclaespl.this.AV23Accion = GXv_char3[0] ;
      }
      else if ( GXutil.strcmp(AV114Opcion3, httpContext.getMessage( "CD0", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char9[0] = AV16Clave ;
         GXv_int12[0] = AV17PrdVal ;
         GXv_int5[0] = AV18BarCod ;
         GXv_int6[0] = AV19BarCodReo ;
         GXv_char7[0] = AV20BarCodPar ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int11[0] = AV67BarLinMaq ;
         new app.pcladi0(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char3, GXv_char2, GXv_int11) ;
         pclaespl.this.A396EmprCod = GXv_char13[0] ;
         pclaespl.this.AV15Descrip = GXv_char10[0] ;
         pclaespl.this.AV16Clave = GXv_char9[0] ;
         pclaespl.this.AV17PrdVal = GXv_int12[0] ;
         pclaespl.this.AV18BarCod = GXv_int5[0] ;
         pclaespl.this.AV19BarCodReo = GXv_int6[0] ;
         pclaespl.this.AV20BarCodPar = GXv_char7[0] ;
         pclaespl.this.AV21TotKil = GXv_decimal8[0] ;
         pclaespl.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespl.this.AV23Accion = GXv_char2[0] ;
         pclaespl.this.AV67BarLinMaq = GXv_int11[0] ;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaespl.this.A396EmprCod;
      this.aP1[0] = pclaespl.this.AV15Descrip;
      this.aP2[0] = pclaespl.this.AV16Clave;
      this.aP3[0] = pclaespl.this.AV17PrdVal;
      this.aP4[0] = pclaespl.this.AV18BarCod;
      this.aP5[0] = pclaespl.this.AV19BarCodReo;
      this.aP6[0] = pclaespl.this.AV20BarCodPar;
      this.aP7[0] = pclaespl.this.AV21TotKil;
      this.aP8[0] = pclaespl.this.AV22PrdDesc;
      this.aP9[0] = pclaespl.this.AV23Accion;
      this.aP10[0] = pclaespl.this.AV67BarLinMaq;
      this.aP11[0] = pclaespl.this.AV113Opi;
      this.aP12[0] = pclaespl.this.AV115BarFactin;
      this.aP13[0] = pclaespl.this.AV116Clave_PQ;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Opcion = "" ;
      AV114Opcion3 = "" ;
      GXv_int4 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV113Opi ;
   private byte GXv_int4[] ;
   private byte GXv_int12[] ;
   private byte GXv_int6[] ;
   private short AV67BarLinMaq ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV115BarFactin ;
   private String AV116Clave_PQ ;
   private String AV24Opcion ;
   private String AV114Opcion3 ;
   private String GXv_char1[] ;
   private String GXv_char13[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
}

