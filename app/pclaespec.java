package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaespec extends GXProcedure
{
   public pclaespec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaespec.class ), "" );
   }

   public pclaespec( int remoteHandle ,
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
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclaespec.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pclaespec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaespec.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaespec.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaespec.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaespec.this.AV114DisCod = aP4[0];
      this.aP4 = aP4;
      pclaespec.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclaespec.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclaespec.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclaespec.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      pclaespec.this.AV113BarFactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      AV112Opcion3 = GXutil.substring( AV16Clave, 1, 3) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV15Descrip ;
         GXv_char3[0] = AV16Clave ;
         GXv_int4[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char7[0] = AV22PrdDesc ;
         GXv_char8[0] = AV23Accion ;
         GXv_int9[0] = AV111Opi ;
         new app.pclaafd(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_char7, GXv_char8, GXv_int9) ;
         pclaespec.this.A396EmprCod = GXv_char1[0] ;
         pclaespec.this.AV15Descrip = GXv_char2[0] ;
         pclaespec.this.AV16Clave = GXv_char3[0] ;
         pclaespec.this.AV17PrdVal = GXv_int4[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char7[0] ;
         pclaespec.this.AV23Accion = GXv_char8[0] ;
         pclaespec.this.AV111Opi = GXv_int9[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AR", "")) == 0 )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_char7[0] = AV15Descrip ;
         GXv_char3[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclaard(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_char3, GXv_int9, GXv_int5, GXv_decimal6, GXv_char2, GXv_char1, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char8[0] ;
         pclaespec.this.AV15Descrip = GXv_char7[0] ;
         pclaespec.this.AV16Clave = GXv_char3[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespec.this.AV23Accion = GXv_char1[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MA", "")) == 0 )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_char7[0] = AV15Descrip ;
         GXv_char3[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char2[0] = AV22PrdDesc ;
         GXv_char1[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char10[0] = AV113BarFactin ;
         new app.pclamatd(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_char3, GXv_int9, GXv_int5, GXv_decimal6, GXv_char2, GXv_char1, GXv_int4, GXv_char10) ;
         pclaespec.this.A396EmprCod = GXv_char8[0] ;
         pclaespec.this.AV15Descrip = GXv_char7[0] ;
         pclaespec.this.AV16Clave = GXv_char3[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char2[0] ;
         pclaespec.this.AV23Accion = GXv_char1[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char10[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TC", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclatc1d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TN", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclatnd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TM", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclatmd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AC", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclaacd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "PR", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclaprd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IT", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclaitd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CL", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclacld(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TP", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclatpd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IF", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclaifd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MM", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclammd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C1", "")) == 0 ) && ( GXutil.strcmp(AV112Opcion3, httpContext.getMessage( "C1 ", "")) == 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclac1d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C2", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclac2d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C3", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac3d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C4", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac4d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C5", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac5d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C6", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac6d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C7", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac7d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C8", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclac8d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C9", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac9d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV112Opcion3, httpContext.getMessage( "C10", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac10d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV112Opcion3, httpContext.getMessage( "C11", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         GXv_char1[0] = AV113BarFactin ;
         new app.pclac11d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4, GXv_char1) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
         pclaespec.this.AV113BarFactin = GXv_char1[0] ;
      }
      else if ( GXutil.strcmp(AV112Opcion3, httpContext.getMessage( "C12", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclac12d(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "FS", "")) == 0 )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char8[0] = AV15Descrip ;
         GXv_char7[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV114DisCod ;
         GXv_decimal6[0] = AV21TotKil ;
         GXv_char3[0] = AV22PrdDesc ;
         GXv_char2[0] = AV23Accion ;
         GXv_int4[0] = AV111Opi ;
         new app.pclafsd(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7, GXv_int9, GXv_int5, GXv_decimal6, GXv_char3, GXv_char2, GXv_int4) ;
         pclaespec.this.A396EmprCod = GXv_char10[0] ;
         pclaespec.this.AV15Descrip = GXv_char8[0] ;
         pclaespec.this.AV16Clave = GXv_char7[0] ;
         pclaespec.this.AV17PrdVal = GXv_int9[0] ;
         pclaespec.this.AV114DisCod = GXv_int5[0] ;
         pclaespec.this.AV21TotKil = GXv_decimal6[0] ;
         pclaespec.this.AV22PrdDesc = GXv_char3[0] ;
         pclaespec.this.AV23Accion = GXv_char2[0] ;
         pclaespec.this.AV111Opi = GXv_int4[0] ;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaespec.this.A396EmprCod;
      this.aP1[0] = pclaespec.this.AV15Descrip;
      this.aP2[0] = pclaespec.this.AV16Clave;
      this.aP3[0] = pclaespec.this.AV17PrdVal;
      this.aP4[0] = pclaespec.this.AV114DisCod;
      this.aP5[0] = pclaespec.this.AV21TotKil;
      this.aP6[0] = pclaespec.this.AV22PrdDesc;
      this.aP7[0] = pclaespec.this.AV23Accion;
      this.aP8[0] = pclaespec.this.AV111Opi;
      this.aP9[0] = pclaespec.this.AV113BarFactin;
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
      AV112Opcion3 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private byte GXv_int9[] ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private int AV114DisCod ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113BarFactin ;
   private String AV24Opcion ;
   private String AV112Opcion3 ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
}

