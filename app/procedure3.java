package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procedure3 extends GXProcedure
{
   public procedure3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procedure3.class ), "" );
   }

   public procedure3( int remoteHandle ,
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
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      procedure3.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      procedure3.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      procedure3.this.AV9LecBarCod = aP1[0];
      this.aP1 = aP1;
      procedure3.this.AV10LecBarReo = aP2[0];
      this.aP2 = aP2;
      procedure3.this.AV11LecBarPar = aP3[0];
      this.aP3 = aP3;
      procedure3.this.AV12LecFasOrd = aP4[0];
      this.aP4 = aP4;
      procedure3.this.AV13LecFasCod = aP5[0];
      this.aP5 = aP5;
      procedure3.this.AV14LecMaqCod = aP6[0];
      this.aP6 = aP6;
      procedure3.this.AV16LecHdr = aP7[0];
      this.aP7 = aP7;
      procedure3.this.AV15LecParCod = aP8[0];
      this.aP8 = aP8;
      procedure3.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV17EstFase ;
      GXv_char2[0] = AV18Terminus ;
      new app.psitfas(remoteHandle, context).execute( AV8EmprCod, AV9LecBarCod, AV10LecBarReo, AV11LecBarPar, AV12LecFasOrd, GXv_char1, GXv_char2) ;
      procedure3.this.AV17EstFase = GXv_char1[0] ;
      procedure3.this.AV18Terminus = GXv_char2[0] ;
      GXv_char2[0] = AV19LecFasNom ;
      new app.pfasdsc(remoteHandle, context).execute( AV8EmprCod, AV13LecFasCod, GXv_char2) ;
      procedure3.this.AV19LecFasNom = GXv_char2[0] ;
      GXv_char2[0] = AV20maqdsc ;
      new app.pobtmaq(remoteHandle, context).execute( AV8EmprCod, AV14LecMaqCod, GXv_char2) ;
      procedure3.this.AV20maqdsc = GXv_char2[0] ;
      AV21texto1 = " " ;
      if ( ( GXutil.strcmp(AV17EstFase, httpContext.getMessage( "I", "")) == 0 ) && ( AV15LecParCod == 0 ) )
      {
         AV21texto1 = httpContext.getMessage( "La Hdr ", "") + AV16LecHdr + httpContext.getMessage( " esta TODAVIA en PROCESO en FASE ", "") + GXutil.trim( AV19LecFasNom) ;
      }
      else if ( ( GXutil.strcmp(AV17EstFase, httpContext.getMessage( "F", "")) == 0 ) && ( AV15LecParCod == 0 ) )
      {
         AV21texto1 = httpContext.getMessage( "La Hdr ", "") + AV16LecHdr + httpContext.getMessage( " esta FINALIZADA en Fase ", "") + GXutil.trim( AV19LecFasNom) ;
      }
      else if ( AV15LecParCod > 0 )
      {
         GXv_char2[0] = AV8EmprCod ;
         GXv_int3[0] = AV9LecBarCod ;
         GXv_int4[0] = AV10LecBarReo ;
         GXv_char1[0] = AV11LecBarPar ;
         GXv_int5[0] = AV12LecFasOrd ;
         GXv_char6[0] = AV14LecMaqCod ;
         GXv_int7[0] = AV15LecParCod ;
         GXv_char8[0] = AV23vEstParo ;
         GXv_dtime9[0] = GXutil.resetTime( AV24InicioParo );
         new app.pstparo(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char1, GXv_int5, GXv_char6, GXv_int7, GXv_char8, GXv_dtime9) ;
         procedure3.this.AV8EmprCod = GXv_char2[0] ;
         procedure3.this.AV9LecBarCod = GXv_int3[0] ;
         procedure3.this.AV10LecBarReo = GXv_int4[0] ;
         procedure3.this.AV11LecBarPar = GXv_char1[0] ;
         procedure3.this.AV12LecFasOrd = GXv_int5[0] ;
         procedure3.this.AV14LecMaqCod = GXv_char6[0] ;
         procedure3.this.AV15LecParCod = GXv_int7[0] ;
         procedure3.this.AV23vEstParo = GXv_char8[0] ;
         procedure3.this.AV24InicioParo = GXutil.resetTime(GXv_dtime9[0]) ;
         if ( GXutil.strcmp(AV23vEstParo, httpContext.getMessage( "INICIADO", "")) == 0 )
         {
            AV21texto1 = httpContext.getMessage( "En maquina ", "") + GXutil.trim( AV20maqdsc) + httpContext.getMessage( " esta INICIADO el PARO ", "") + GXutil.trim( AV22Parcodnom) + "¡¡¡¡" ;
         }
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = procedure3.this.AV8EmprCod;
      this.aP1[0] = procedure3.this.AV9LecBarCod;
      this.aP2[0] = procedure3.this.AV10LecBarReo;
      this.aP3[0] = procedure3.this.AV11LecBarPar;
      this.aP4[0] = procedure3.this.AV12LecFasOrd;
      this.aP5[0] = procedure3.this.AV13LecFasCod;
      this.aP6[0] = procedure3.this.AV14LecMaqCod;
      this.aP7[0] = procedure3.this.AV16LecHdr;
      this.aP8[0] = procedure3.this.AV15LecParCod;
      this.aP9[0] = procedure3.this.AV21texto1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21texto1 = "" ;
      AV17EstFase = "" ;
      AV18Terminus = "" ;
      AV19LecFasNom = "" ;
      AV20maqdsc = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new short[1] ;
      AV23vEstParo = "" ;
      GXv_char8 = new String[1] ;
      AV24InicioParo = GXutil.nullDate() ;
      GXv_dtime9 = new java.util.Date[1] ;
      AV22Parcodnom = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10LecBarReo ;
   private byte GXv_int4[] ;
   private short AV12LecFasOrd ;
   private short AV15LecParCod ;
   private short GXv_int5[] ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV9LecBarCod ;
   private int GXv_int3[] ;
   private String AV8EmprCod ;
   private String AV11LecBarPar ;
   private String AV13LecFasCod ;
   private String AV14LecMaqCod ;
   private String AV16LecHdr ;
   private String AV17EstFase ;
   private String AV18Terminus ;
   private String AV19LecFasNom ;
   private String AV20maqdsc ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String AV23vEstParo ;
   private String GXv_char8[] ;
   private String AV22Parcodnom ;
   private java.util.Date GXv_dtime9[] ;
   private java.util.Date AV24InicioParo ;
   private String AV21texto1 ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
}

