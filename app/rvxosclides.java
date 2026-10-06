package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rvxosclides extends GXProcedure
{
   public rvxosclides( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rvxosclides.class ), "" );
   }

   public rvxosclides( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 )
   {
      rvxosclides.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int[] aP3 )
   {
      rvxosclides.this.AV12VxOFabTip = aP0;
      rvxosclides.this.AV13BarCod = aP1;
      rvxosclides.this.AV14Modo = aP2;
      rvxosclides.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.rvxpedori(remoteHandle, context).execute( ) ;
      if ( GXutil.strcmp(AV14Modo, httpContext.getMessage( "PRI", "")) == 0 )
      {
         AV10Char20 = AV11DatosPed[1-1][7-1] ;
         AV16VxOsCliDes = (int)(GXutil.lval( AV10Char20)) ;
      }
      else
      {
         AV10Char20 = AV11DatosPed[1-1][7-1] ;
         AV16VxOsCliDes = (int)(GXutil.lval( AV10Char20)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = rvxosclides.this.AV16VxOsCliDes;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Char20 = "" ;
      AV11DatosPed = new String[99][9] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         GX_J = 1 ;
         while ( GX_J <= 9 )
         {
            AV11DatosPed[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13BarCod ;
   private int AV16VxOsCliDes ;
   private int GX_I ;
   private int GX_J ;
   private String AV12VxOFabTip ;
   private String AV14Modo ;
   private String AV10Char20 ;
   private String AV11DatosPed[][] ;
   private int[] aP3 ;
}

