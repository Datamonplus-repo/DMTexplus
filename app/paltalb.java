package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltalb extends GXProcedure
{
   public paltalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltalb.class ), "" );
   }

   public paltalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      paltalb.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      paltalb.this.AV15AlbRecCod = aP0[0];
      this.aP0 = aP0;
      paltalb.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      paltalb.this.AV17DisArtCod = aP2[0];
      this.aP2 = aP2;
      paltalb.this.AV18Unidades = aP3[0];
      this.aP3 = aP3;
      paltalb.this.AV19vDisLoc = aP4[0];
      this.aP4 = aP4;
      paltalb.this.AV20EmprCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15AlbRecCod = 0 ;
      AV21FlagMab = (byte)(0) ;
      GXv_int1[0] = AV22Albre5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "ALBRE5", ""), GXv_int1) ;
      paltalb.this.AV22Albre5 = GXv_int1[0] ;
      if ( AV22Albre5 == 0 )
      {
         httpContext.wjLoc = formatLink("app.talbre2", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
      }
      else
      {
         httpContext.wjLoc = formatLink("app.talbre5", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltalb.this.AV15AlbRecCod;
      this.aP1[0] = paltalb.this.AV16CliCod;
      this.aP2[0] = paltalb.this.AV17DisArtCod;
      this.aP3[0] = paltalb.this.AV18Unidades;
      this.aP4[0] = paltalb.this.AV19vDisLoc;
      this.aP5[0] = paltalb.this.AV20EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21FlagMab ;
   private byte AV22Albre5 ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int AV15AlbRecCod ;
   private int AV16CliCod ;
   private String AV17DisArtCod ;
   private String AV18Unidades ;
   private String AV19vDisLoc ;
   private String AV20EmprCod ;
   private String[] aP5 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
}

