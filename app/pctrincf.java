package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrincf extends GXProcedure
{
   public pctrincf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrincf.class ), "" );
   }

   public pctrincf( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pctrincf.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pctrincf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrincf.this.AV12BarCod = aP1[0];
      this.aP1 = aP1;
      pctrincf.this.AV13BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrincf.this.AV14BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrincf.this.AV20BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pctrincf.this.AV22FasCod = aP5[0];
      this.aP5 = aP5;
      pctrincf.this.AV19OrdemOld = aP6[0];
      this.aP6 = aP6;
      pctrincf.this.AV21FasCodold = aP7[0];
      this.aP7 = aP7;
      pctrincf.this.Gx_mode = aP8[0];
      this.aP8 = aP8;
      pctrincf.this.AV15Tinamar = aP9[0];
      this.aP9 = aP9;
      pctrincf.this.AV16UsurCod = aP10[0];
      this.aP10 = aP10;
      pctrincf.this.AV17Station = aP11[0];
      this.aP11 = aP11;
      pctrincf.this.AV18Pgmnamei = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV24CtrlUsu ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRLOS", ""), GXv_int2) ;
      pctrincf.this.GXt_int1 = GXv_int2[0] ;
      AV24CtrlUsu = GXt_int1 ;
      if ( ( AV15Tinamar == 1 ) || ( AV24CtrlUsu == 1 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV12BarCod ;
         GXv_int2[0] = AV13BarCodReo ;
         GXv_char5[0] = AV14BarCodPar ;
         GXv_char6[0] = AV16UsurCod ;
         new app.pctrusu(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6) ;
         pctrincf.this.A396EmprCod = GXv_char3[0] ;
         pctrincf.this.AV12BarCod = GXv_int4[0] ;
         pctrincf.this.AV13BarCodReo = GXv_int2[0] ;
         pctrincf.this.AV14BarCodPar = GXv_char5[0] ;
         pctrincf.this.AV16UsurCod = GXv_char6[0] ;
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         AV23Texto_i = httpContext.getMessage( "ALTA LINEA. Orden = ", "") + GXutil.str( AV20BarOrdLin, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "            Fase = ", "") + AV22FasCod + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmnamei, AV16UsurCod, AV17Station, AV23Texto_i, AV12BarCod, AV13BarCodReo, AV14BarCodPar) ;
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         AV23Texto_i = httpContext.getMessage( "MODIFICACION LINEA.  Orden Fase Inicial= ", "") + GXutil.str( AV19OrdemOld, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "                     Fase Inicial= ", "") + AV21FasCodold + GXutil.newLine( ) + httpContext.getMessage( "                     Orden Fase Nueva= ", "") + GXutil.str( AV20BarOrdLin, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "                     Fase Nueva= ", "") + AV22FasCod + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmnamei, AV16UsurCod, AV17Station, AV23Texto_i, AV12BarCod, AV13BarCodReo, AV14BarCodPar) ;
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         AV23Texto_i = httpContext.getMessage( "ELIMINACION LINEA .Orden Fase Inicial= ", "") + GXutil.str( AV20BarOrdLin, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "                   Fase Inicial= ", "") + AV22FasCod + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmnamei, AV16UsurCod, AV17Station, AV23Texto_i, AV12BarCod, AV13BarCodReo, AV14BarCodPar) ;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrincf.this.A396EmprCod;
      this.aP1[0] = pctrincf.this.AV12BarCod;
      this.aP2[0] = pctrincf.this.AV13BarCodReo;
      this.aP3[0] = pctrincf.this.AV14BarCodPar;
      this.aP4[0] = pctrincf.this.AV20BarOrdLin;
      this.aP5[0] = pctrincf.this.AV22FasCod;
      this.aP6[0] = pctrincf.this.AV19OrdemOld;
      this.aP7[0] = pctrincf.this.AV21FasCodold;
      this.aP8[0] = pctrincf.this.Gx_mode;
      this.aP9[0] = pctrincf.this.AV15Tinamar;
      this.aP10[0] = pctrincf.this.AV16UsurCod;
      this.aP11[0] = pctrincf.this.AV17Station;
      this.aP12[0] = pctrincf.this.AV18Pgmnamei;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV23Texto_i = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13BarCodReo ;
   private byte AV15Tinamar ;
   private byte AV24CtrlUsu ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV20BarOrdLin ;
   private short AV19OrdemOld ;
   private short Gx_err ;
   private int AV12BarCod ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String AV14BarCodPar ;
   private String AV22FasCod ;
   private String AV21FasCodold ;
   private String Gx_mode ;
   private String AV16UsurCod ;
   private String AV17Station ;
   private String AV18Pgmnamei ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV23Texto_i ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
}

