package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart9 extends GXProcedure
{
   public ppedart9( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart9.class ), "" );
   }

   public ppedart9( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      ppedart9.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      ppedart9.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart9.this.A8197PArId = aP1[0];
      this.aP1 = aP1;
      ppedart9.this.Gx_emsg = aP2[0];
      this.aP2 = aP2;
      ppedart9.this.AV11OkChk = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Chequeando pedido..", "") );
      GXt_int1 = AV11OkChk ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A8197PArId ;
      GXv_char4[0] = Gx_msg ;
      GXv_int5[0] = GXt_int1 ;
      new app.ppedartc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5) ;
      ppedart9.this.A396EmprCod = GXv_char2[0] ;
      ppedart9.this.A8197PArId = GXv_int3[0] ;
      ppedart9.this.Gx_msg = GXv_char4[0] ;
      ppedart9.this.GXt_int1 = GXv_int5[0] ;
      AV11OkChk = GXt_int1 ;
      if ( AV11OkChk < 0 )
      {
         if ( AV11OkChk == -1 )
         {
            Gx_emsg = httpContext.getMessage( "Faltan colores.", "") ;
         }
         else if ( AV11OkChk == -2 )
         {
            Gx_emsg = httpContext.getMessage( "Precios de colores, hay algún precio en 0.", "") ;
         }
         else if ( AV11OkChk == -3 )
         {
            Gx_emsg = httpContext.getMessage( "Precios de colores, falta una intensidad en la lista.", "") ;
         }
         else if ( AV11OkChk == -4 )
         {
            Gx_emsg = httpContext.getMessage( "Colores, es desarrollo y no está marcado.", "") ;
         }
         else if ( AV11OkChk == -5 )
         {
            Gx_emsg = httpContext.getMessage( "Hay Colores sin intensidad.", "") ;
         }
         else if ( AV11OkChk == -6 )
         {
            Gx_emsg = httpContext.getMessage( "Hay intensidades sin precio.", "") ;
         }
         else if ( AV11OkChk == -7 )
         {
            Gx_emsg = httpContext.getMessage( "Colores, no coinciden cantidades.", "") ;
         }
         else if ( AV11OkChk == -11 )
         {
            Gx_emsg = httpContext.getMessage( "Falta un diseño/pintas de Estampado.", "") ;
         }
         else if ( AV11OkChk == -12 )
         {
            Gx_emsg = httpContext.getMessage( "Falta un diseño/pinta en los precios de Estampado.", "") ;
         }
         else if ( AV11OkChk == -13 )
         {
            Gx_emsg = httpContext.getMessage( "Hay un Precio de Estampado en 0.", "") ;
         }
         else if ( AV11OkChk == -21 )
         {
            Gx_emsg = httpContext.getMessage( "Falta una fase de Acabado.", "") ;
         }
         else if ( AV11OkChk == -22 )
         {
            Gx_emsg = httpContext.getMessage( "Hay una fase con precio obligatorio y sin precio.", "") ;
         }
         else if ( AV11OkChk == -31 )
         {
            Gx_emsg = httpContext.getMessage( "Hay un adicional sin precio.", "") ;
         }
         else
         {
            Gx_emsg = httpContext.getMessage( "Error Desconocido.", "") ;
         }
         Gx_emsg += GXutil.newLine( ) + httpContext.getMessage( "Info Adicional : ", "") + GXutil.newLine( ) + Gx_msg ;
      }
      else
      {
         Gx_emsg = httpContext.getMessage( "Pedido Ok.", "") ;
      }
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart9.this.A396EmprCod;
      this.aP1[0] = ppedart9.this.A8197PArId;
      this.aP2[0] = ppedart9.this.Gx_emsg;
      this.aP3[0] = ppedart9.this.AV11OkChk;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11OkChk ;
   private byte GXt_int1 ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A8197PArId ;
   private int GXv_int3[] ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
}

