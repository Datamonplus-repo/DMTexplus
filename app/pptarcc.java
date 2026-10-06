package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptarcc extends GXProcedure
{
   public pptarcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptarcc.class ), "" );
   }

   public pptarcc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pptarcc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pptarcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptarcc.this.AV11Clicod = aP1[0];
      this.aP1 = aP1;
      pptarcc.this.AV10Tb1_cod = aP2[0];
      this.aP2 = aP2;
      pptarcc.this.AV9Ccartcod = aP3[0];
      this.aP3 = aP3;
      pptarcc.this.AV8CCartdsc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV9Ccartcod, " ") != 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV11Clicod ;
         GXv_int3[0] = AV10Tb1_cod ;
         GXv_char4[0] = AV9Ccartcod ;
         GXv_int5[0] = AV12Tipartiid ;
         GXv_char6[0] = AV13tipArtids ;
         new app.pcccno1insert(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6) ;
         pptarcc.this.A396EmprCod = GXv_char1[0] ;
         pptarcc.this.AV11Clicod = GXv_int2[0] ;
         pptarcc.this.AV10Tb1_cod = GXv_int3[0] ;
         pptarcc.this.AV9Ccartcod = GXv_char4[0] ;
         pptarcc.this.AV12Tipartiid = GXv_int5[0] ;
         pptarcc.this.AV13tipArtids = GXv_char6[0] ;
         httpContext.wjLoc = formatLink("app.tcolscc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Tb1_cod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV9Ccartcod)),GXutil.URLEncode(GXutil.rtrim(AV8CCartdsc)),GXutil.URLEncode(GXutil.ltrimstr(AV12Tipartiid,4,0)),GXutil.URLEncode(GXutil.rtrim(AV13tipArtids))}, new String[] {"EmprCod","CliCod","Tb1_Cod","CCArtCod","CCArtdsc","TipArtiId","TipArtiDs"})  ;
      }
      else
      {
         httpContext.wjLoc = formatLink("app.ttarcc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Tb1_cod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV9Ccartcod)),GXutil.URLEncode(GXutil.rtrim(AV8CCartdsc))}, new String[] {"EmprCod","CliCod","Tb1_Cod","CCArtCod","CCArtdsc"})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptarcc.this.A396EmprCod;
      this.aP1[0] = pptarcc.this.AV11Clicod;
      this.aP2[0] = pptarcc.this.AV10Tb1_cod;
      this.aP3[0] = pptarcc.this.AV9Ccartcod;
      this.aP4[0] = pptarcc.this.AV8CCartdsc;
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
      GXv_int3 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      AV13tipArtids = "" ;
      GXv_char6 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10Tb1_cod ;
   private short GXv_int3[] ;
   private short AV12Tipartiid ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV11Clicod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV9Ccartcod ;
   private String AV8CCartdsc ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV13tipArtids ;
   private String GXv_char6[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
}

