package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltal2 extends GXProcedure
{
   public paltal2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltal2.class ), "" );
   }

   public paltal2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      paltal2.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      paltal2.this.AV20EmprCod = aP0[0];
      this.aP0 = aP0;
      paltal2.this.AV15AlbRecCod = aP1[0];
      this.aP1 = aP1;
      paltal2.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      paltal2.this.AV17DisArtCod = aP3[0];
      this.aP3 = aP3;
      paltal2.this.AV18Unidades = aP4[0];
      this.aP4 = aP4;
      paltal2.this.AV19vDisLoc = aP5[0];
      this.aP5 = aP5;
      paltal2.this.AV24DisCliNum = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21FlagPRef = (byte)(0) ;
      GXv_int1[0] = AV21FlagPRef ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int1) ;
      paltal2.this.AV21FlagPRef = GXv_int1[0] ;
      AV22Tintto = (byte)(0) ;
      GXv_int1[0] = AV22Tintto ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int1) ;
      paltal2.this.AV22Tintto = GXv_int1[0] ;
      AV23PzaKMA = (byte)(0) ;
      GXv_int1[0] = AV23PzaKMA ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "PZAKMA", ""), GXv_int1) ;
      paltal2.this.AV23PzaKMA = GXv_int1[0] ;
      AV25Vincol = (byte)(0) ;
      GXv_int1[0] = AV25Vincol ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int1) ;
      paltal2.this.AV25Vincol = GXv_int1[0] ;
      AV26PzaMKA = (byte)(0) ;
      GXv_int1[0] = AV26PzaMKA ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "PZAMKA", ""), GXv_int1) ;
      paltal2.this.AV26PzaMKA = GXv_int1[0] ;
      GXt_int2 = AV27Talbdet ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "EMPDET", ""), GXv_int1) ;
      paltal2.this.GXt_int2 = GXv_int1[0] ;
      AV27Talbdet = GXt_int2 ;
      AV15AlbRecCod = 0 ;
      if ( ( AV22Tintto == 1 ) || ( AV23PzaKMA == 1 ) )
      {
         httpContext.wjLoc = formatLink("app.talbde4", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
      }
      else
      {
         if ( ( AV25Vincol == 1 ) || ( AV26PzaMKA == 1 ) )
         {
            httpContext.wjLoc = formatLink("app.talbde5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc)),GXutil.URLEncode(GXutil.rtrim(AV24DisCliNum))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc","DisCliNum"})  ;
         }
         else
         {
            if ( (0==AV21FlagPRef) )
            {
               if ( AV27Talbdet == 0 )
               {
                  httpContext.wjLoc = formatLink("app.talbde2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
               }
               else
               {
                  httpContext.wjLoc = formatLink("app.tpalbdet", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
               }
            }
            else
            {
               httpContext.wjLoc = formatLink("app.talbdpd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18Unidades)),GXutil.URLEncode(GXutil.rtrim(AV19vDisLoc))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltal2.this.AV20EmprCod;
      this.aP1[0] = paltal2.this.AV15AlbRecCod;
      this.aP2[0] = paltal2.this.AV16CliCod;
      this.aP3[0] = paltal2.this.AV17DisArtCod;
      this.aP4[0] = paltal2.this.AV18Unidades;
      this.aP5[0] = paltal2.this.AV19vDisLoc;
      this.aP6[0] = paltal2.this.AV24DisCliNum;
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

   private byte AV21FlagPRef ;
   private byte AV22Tintto ;
   private byte AV23PzaKMA ;
   private byte AV25Vincol ;
   private byte AV26PzaMKA ;
   private byte AV27Talbdet ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int AV15AlbRecCod ;
   private int AV16CliCod ;
   private String AV20EmprCod ;
   private String AV17DisArtCod ;
   private String AV18Unidades ;
   private String AV19vDisLoc ;
   private String AV24DisCliNum ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

