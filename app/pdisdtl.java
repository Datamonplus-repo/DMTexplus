package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisdtl extends GXProcedure
{
   public pdisdtl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisdtl.class ), "" );
   }

   public pdisdtl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pdisdtl.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pdisdtl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisdtl.this.AV23DisCod = aP1[0];
      this.aP1 = aP1;
      pdisdtl.this.AV22AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdisdtl.this.Gx_mode = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
      }
      httpContext.wjLoc = formatLink("app.tdisdtp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22AlbRecCod,8,0))}, new String[] {"EmprCod","DisCod","AlbRecCod"})  ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV23DisCod ;
      GXv_int3[0] = AV22AlbRecCod ;
      new app.pdisalbu(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      pdisdtl.this.A396EmprCod = GXv_char1[0] ;
      pdisdtl.this.AV23DisCod = GXv_int2[0] ;
      pdisdtl.this.AV22AlbRecCod = GXv_int3[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisdtl.this.A396EmprCod;
      this.aP1[0] = pdisdtl.this.AV23DisCod;
      this.aP2[0] = pdisdtl.this.AV22AlbRecCod;
      this.aP3[0] = pdisdtl.this.Gx_mode;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV23DisCod ;
   private int AV22AlbRecCod ;
   private int GXv_int2[] ;
   private int GXv_int3[] ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String GXv_char1[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
}

