package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preparoxls extends GXProcedure
{
   public preparoxls( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preparoxls.class ), "" );
   }

   public preparoxls( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      preparoxls.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      preparoxls.this.AV13DirOri = aP0[0];
      this.aP0 = aP0;
      preparoxls.this.AV8Error = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      preparoxls.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      preparoxls.this.AV15EmprCod = GXv_char2[0] ;
      preparoxls.this.AV16EmprNom = GXv_char3[0] ;
      preparoxls.this.AV17UsurCod = GXv_char4[0] ;
      GXt_int5 = AV18Cambiarcpp ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CAMCPP", ""), GXv_int6) ;
      preparoxls.this.GXt_int5 = GXv_int6[0] ;
      AV18Cambiarcpp = GXt_int5 ;
      AV8Error = (byte)(0) ;
      AV9Busco[1-1] = "?" ;
      AV10Remp[1-1] = "" ;
      if ( AV18Cambiarcpp == 0 )
      {
         AV9Busco[2-1] = "." ;
         AV10Remp[2-1] = "," ;
      }
      else
      {
         AV9Busco[2-1] = " " ;
         AV10Remp[2-1] = " " ;
      }
      AV11Nro = (int)(GXutil.random( )*1000000) ;
      AV12DirDes = httpContext.getMessage( "TF_", "") + GXutil.trim( GXutil.str( AV11Nro, 10, 0)) + httpContext.getMessage( ".txt", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preparoxls.this.AV13DirOri;
      this.aP1[0] = preparoxls.this.AV8Error;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Station = "" ;
      GXt_char1 = "" ;
      AV15EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV9Busco = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV9Busco[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV10Remp = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV10Remp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV12DirDes = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Error ;
   private byte AV18Cambiarcpp ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV11Nro ;
   private int GX_I ;
   private String AV13DirOri ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15EmprCod ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String AV9Busco[] ;
   private String AV10Remp[] ;
   private String AV12DirDes ;
   private byte[] aP1 ;
   private String[] aP0 ;
}

