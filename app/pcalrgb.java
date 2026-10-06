package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalrgb extends GXProcedure
{
   public pcalrgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalrgb.class ), "" );
   }

   public pcalrgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( long[] aP0 )
   {
      pcalrgb.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 )
   {
      pcalrgb.this.AV12ForRGB = aP0[0];
      this.aP0 = aP0;
      pcalrgb.this.AV8Selected = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV8Selected == -1 )
      {
         AV8Selected = 13619151 ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se ha seleccionado ningún color", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalrgb.this.AV12ForRGB;
      this.aP1[0] = pcalrgb.this.AV8Selected;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV12ForRGB ;
   private long AV8Selected ;
   private long[] aP1 ;
   private long[] aP0 ;
}

