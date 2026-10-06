package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupq000 extends GXProcedure
{
   public pupq000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupq000.class ), "" );
   }

   public pupq000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      pupq000.this.AV9Emprcod = aP0;
      pupq000.this.AV33Prdnum1 = aP1;
      pupq000.this.AV32Prdnum2 = aP2;
      pupq000.this.AV15File = aP3;
      pupq000.this.AV50PgmnameOut = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10UsurCod = " " ;
      AV11Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9Emprcod ;
      GXv_char2[0] = AV12EmprNom ;
      GXv_char3[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char1, GXv_char2, GXv_char3) ;
      pupq000.this.AV9Emprcod = GXv_char1[0] ;
      pupq000.this.AV12EmprNom = GXv_char2[0] ;
      pupq000.this.AV10UsurCod = GXv_char3[0] ;
      GXt_int4 = AV41Password ;
      GXv_char3[0] = AV9Emprcod ;
      GXv_char2[0] = httpContext.getMessage( "PSWAUD", "") ;
      GXv_int5[0] = GXt_int4 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int5) ;
      pupq000.this.AV9Emprcod = GXv_char3[0] ;
      pupq000.this.GXt_int4 = GXv_int5[0] ;
      AV41Password = (int)(GXt_int4) ;
      GXt_int6 = AV46Cotexsur ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV9Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int7) ;
      pupq000.this.GXt_int6 = GXv_int7[0] ;
      AV46Cotexsur = GXt_int6 ;
      AV43Siacumular = ((AV46Cotexsur==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      GXt_int6 = AV49Upq1001 ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV9Emprcod, httpContext.getMessage( "UPQ101", ""), GXv_int7) ;
      pupq000.this.GXt_int6 = GXv_int7[0] ;
      AV49Upq1001 = GXt_int6 ;
      GXv_char3[0] = AV9Emprcod ;
      GXv_char2[0] = AV33Prdnum1 ;
      GXv_char1[0] = AV43Siacumular ;
      GXv_decimal8[0] = AV34Dif ;
      GXv_decimal9[0] = AV35Dif2 ;
      GXv_char10[0] = AV37Obs ;
      new app.pupq003(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_decimal8, GXv_decimal9, GXv_char10) ;
      pupq000.this.AV9Emprcod = GXv_char3[0] ;
      pupq000.this.AV33Prdnum1 = GXv_char2[0] ;
      pupq000.this.AV43Siacumular = GXv_char1[0] ;
      pupq000.this.AV34Dif = GXv_decimal8[0] ;
      pupq000.this.AV35Dif2 = GXv_decimal9[0] ;
      pupq000.this.AV37Obs = GXv_char10[0] ;
      GXv_char10[0] = AV9Emprcod ;
      GXv_char3[0] = AV33Prdnum1 ;
      GXv_decimal9[0] = AV34Dif ;
      GXv_decimal8[0] = AV35Dif2 ;
      GXv_char2[0] = AV37Obs ;
      new app.pupq002(remoteHandle, context).execute( GXv_char10, GXv_char3, GXv_decimal9, GXv_decimal8, GXv_char2) ;
      pupq000.this.AV9Emprcod = GXv_char10[0] ;
      pupq000.this.AV33Prdnum1 = GXv_char3[0] ;
      pupq000.this.AV34Dif = GXv_decimal9[0] ;
      pupq000.this.AV35Dif2 = GXv_decimal8[0] ;
      pupq000.this.AV37Obs = GXv_char2[0] ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      GXv_char10[0] = AV9Emprcod ;
      GXv_char3[0] = AV33Prdnum1 ;
      GXv_char2[0] = AV43Siacumular ;
      GXv_decimal9[0] = AV34Dif ;
      GXv_decimal8[0] = AV35Dif2 ;
      GXv_char1[0] = AV37Obs ;
      new app.pupq003(remoteHandle, context).execute( GXv_char10, GXv_char3, GXv_char2, GXv_decimal9, GXv_decimal8, GXv_char1) ;
      pupq000.this.AV9Emprcod = GXv_char10[0] ;
      pupq000.this.AV33Prdnum1 = GXv_char3[0] ;
      pupq000.this.AV43Siacumular = GXv_char2[0] ;
      pupq000.this.AV34Dif = GXv_decimal9[0] ;
      pupq000.this.AV35Dif2 = GXv_decimal8[0] ;
      pupq000.this.AV37Obs = GXv_char1[0] ;
      GXv_char10[0] = AV9Emprcod ;
      GXv_char3[0] = AV33Prdnum1 ;
      GXv_decimal9[0] = AV34Dif ;
      GXv_decimal8[0] = AV35Dif2 ;
      GXv_char2[0] = AV37Obs ;
      new app.pupq002(remoteHandle, context).execute( GXv_char10, GXv_char3, GXv_decimal9, GXv_decimal8, GXv_char2) ;
      pupq000.this.AV9Emprcod = GXv_char10[0] ;
      pupq000.this.AV33Prdnum1 = GXv_char3[0] ;
      pupq000.this.AV34Dif = GXv_decimal9[0] ;
      pupq000.this.AV35Dif2 = GXv_decimal8[0] ;
      pupq000.this.AV37Obs = GXv_char2[0] ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      httpContext.wjLoc = formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV33Prdnum1)),GXutil.URLEncode(GXutil.rtrim(AV32Prdnum2)),GXutil.URLEncode(GXutil.rtrim(AV43Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV38ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV15File)),GXutil.URLEncode(GXutil.rtrim(AV50PgmnameOut))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10UsurCod = "" ;
      AV11Station = "" ;
      AV12EmprNom = "" ;
      GXv_int5 = new long[1] ;
      AV43Siacumular = "" ;
      GXv_int7 = new byte[1] ;
      AV34Dif = DecimalUtil.ZERO ;
      AV35Dif2 = DecimalUtil.ZERO ;
      AV37Obs = "" ;
      GXv_char1 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      AV38ActDatos = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46Cotexsur ;
   private byte AV49Upq1001 ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int AV41Password ;
   private long GXt_int4 ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV34Dif ;
   private java.math.BigDecimal AV35Dif2 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV9Emprcod ;
   private String AV33Prdnum1 ;
   private String AV32Prdnum2 ;
   private String AV50PgmnameOut ;
   private String AV10UsurCod ;
   private String AV11Station ;
   private String AV12EmprNom ;
   private String AV43Siacumular ;
   private String AV37Obs ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV38ActDatos ;
   private String AV15File ;
}

