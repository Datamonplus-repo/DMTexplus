package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apotifrephdrs extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apotifrephdrs pgm = new apotifrephdrs (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apotifrephdrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apotifrephdrs.class ), "" );
   }

   public apotifrephdrs( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV11UsurCod = " " ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      apotifrephdrs.this.AV9EmprCod = GXv_char1[0] ;
      apotifrephdrs.this.AV10EmprNom = GXv_char2[0] ;
      apotifrephdrs.this.AV11UsurCod = GXv_char3[0] ;
      GXt_char4 = AV25Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      apotifrephdrs.this.GXt_char4 = GXv_char3[0] ;
      AV25Carpeta = GXt_char4 ;
      GXt_char4 = AV25Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apotifrephdrs.this.GXt_char4 = GXv_char3[0] ;
      AV25Carpeta = ((GXutil.strcmp("", AV25Carpeta)==0) ? GXt_char4 : AV25Carpeta) ;
      AV21Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV23Nominf = GXutil.trim( AV33Pgmdesc) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV21Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV20File = GXutil.trim( AV25Carpeta) + "\\" + GXutil.trim( AV23Nominf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV20File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV24Stat = GXutil.deleteFile( AV20File) ;
      }
      GXt_int5 = AV22hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV20File, GXv_int6) ;
      apotifrephdrs.this.GXt_int5 = GXv_int6[0] ;
      AV22hnd = (short)(GXt_int5) ;
      AV19Control = httpContext.getMessage( " Auditoria OTIF. Periodo ", "") + localUtil.dtoc( AV8fecha1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.dtoc( AV26fecha2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + httpContext.getMessage( "Actualizar DATOS = ", "") + AV27actualizar ;
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV22hnd, AV19Control, GXv_int8) ;
      apotifrephdrs.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      System.out.println( AV19Control );
      AV19Control = httpContext.getMessage( "Hdr", "") + ";" + httpContext.getMessage( "N repeticiones", "") + ";" + httpContext.getMessage( "Dias", "") ;
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV22hnd, AV19Control, GXv_int8) ;
      apotifrephdrs.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      System.out.println( AV19Control );
      /* Using cursor P05UM2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, AV8fecha1, AV26fecha2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5UM2 = false ;
         A12781OFIdEmpres = P05UM2_A12781OFIdEmpres[0] ;
         A12782OFFecha = P05UM2_A12782OFFecha[0] ;
         A12793OFHdrP = P05UM2_A12793OFHdrP[0] ;
         A12792OFHdrR = P05UM2_A12792OFHdrR[0] ;
         A12791OFHdr = P05UM2_A12791OFHdr[0] ;
         A12783OFIdSeccio = P05UM2_A12783OFIdSeccio[0] ;
         AV28NumVeces = (short)(0) ;
         AV30Texto = " " ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05UM2_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && ( P05UM2_A12791OFHdr[0] == A12791OFHdr ) && ( P05UM2_A12792OFHdrR[0] == A12792OFHdrR ) && ( GXutil.strcmp(P05UM2_A12793OFHdrP[0], A12793OFHdrP) == 0 ) )
         {
            brk5UM2 = false ;
            A12782OFFecha = P05UM2_A12782OFFecha[0] ;
            A12783OFIdSeccio = P05UM2_A12783OFIdSeccio[0] ;
            AV28NumVeces = (short)(AV28NumVeces+1) ;
            if ( GXutil.strcmp(AV30Texto, "") == 0 )
            {
               AV30Texto = localUtil.dtoc( A12782OFFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            else
            {
               AV30Texto += "-" + localUtil.dtoc( A12782OFFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            brk5UM2 = true ;
            pr_default.readNext(0);
         }
         if ( AV28NumVeces > 1 )
         {
            AV29Hdr = GXutil.str( A12791OFHdr, 8, 0) + "-" + GXutil.str( A12792OFHdrR, 1, 0) + A12793OFHdrP ;
            AV19Control = AV29Hdr + ";" + GXutil.str( AV28NumVeces, 4, 0) + ";" + AV30Texto ;
            GXt_int7 = (byte)(AV24Stat) ;
            GXv_int8[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV22hnd, AV19Control, GXv_int8) ;
            apotifrephdrs.this.GXt_int7 = GXv_int8[0] ;
            AV24Stat = GXt_int7 ;
            System.out.println( AV19Control );
         }
         if ( ! brk5UM2 )
         {
            brk5UM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV22hnd, GXv_int8) ;
      apotifrephdrs.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(potifrephdrs.class);
      return new app.GXcfg();
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
      AV11UsurCod = "" ;
      AV18Station = "" ;
      AV9EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV25Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV21Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV23Nominf = "" ;
      AV33Pgmdesc = "" ;
      AV20File = "" ;
      GXv_int6 = new long[1] ;
      AV19Control = "" ;
      AV8fecha1 = GXutil.nullDate() ;
      AV26fecha2 = GXutil.nullDate() ;
      AV27actualizar = "" ;
      scmdbuf = "" ;
      P05UM2_A12781OFIdEmpres = new String[] {""} ;
      P05UM2_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P05UM2_A12793OFHdrP = new String[] {""} ;
      P05UM2_A12792OFHdrR = new byte[1] ;
      P05UM2_A12791OFHdr = new int[1] ;
      P05UM2_A12783OFIdSeccio = new String[] {""} ;
      A12781OFIdEmpres = "" ;
      A12782OFFecha = GXutil.nullDate() ;
      A12793OFHdrP = "" ;
      A12783OFIdSeccio = "" ;
      AV30Texto = "" ;
      AV29Hdr = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apotifrephdrs__default(),
         new Object[] {
             new Object[] {
            P05UM2_A12781OFIdEmpres, P05UM2_A12782OFFecha, P05UM2_A12793OFHdrP, P05UM2_A12792OFHdrR, P05UM2_A12791OFHdr, P05UM2_A12783OFIdSeccio
            }
         }
      );
      AV33Pgmdesc = httpContext.getMessage( "OTIFRep HDRs", "") ;
      /* GeneXus formulas. */
      AV33Pgmdesc = httpContext.getMessage( "OTIFRep HDRs", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A12792OFHdrR ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV24Stat ;
   private short AV22hnd ;
   private short AV28NumVeces ;
   private short Gx_err ;
   private int A12791OFHdr ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String AV11UsurCod ;
   private String AV18Station ;
   private String AV9EmprCod ;
   private String GXv_char1[] ;
   private String AV10EmprNom ;
   private String GXv_char2[] ;
   private String AV25Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV23Nominf ;
   private String AV33Pgmdesc ;
   private String AV27actualizar ;
   private String scmdbuf ;
   private String A12781OFIdEmpres ;
   private String A12793OFHdrP ;
   private String A12783OFIdSeccio ;
   private String AV30Texto ;
   private String AV29Hdr ;
   private java.util.Date AV21Hhmmss ;
   private java.util.Date AV8fecha1 ;
   private java.util.Date AV26fecha2 ;
   private java.util.Date A12782OFFecha ;
   private boolean Cond_result ;
   private boolean brk5UM2 ;
   private String AV20File ;
   private String AV19Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05UM2_A12781OFIdEmpres ;
   private java.util.Date[] P05UM2_A12782OFFecha ;
   private String[] P05UM2_A12793OFHdrP ;
   private byte[] P05UM2_A12792OFHdrR ;
   private int[] P05UM2_A12791OFHdr ;
   private String[] P05UM2_A12783OFIdSeccio ;
}

final  class apotifrephdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UM2", "SELECT OFIdEmpres, OFFecha, OFHdrP, OFHdrR, OFHdr, OFIdSeccio FROM TXPOTIFDE WHERE (OFIdEmpres = ?) AND (OFFecha >= ?) AND (OFFecha <= ?) ORDER BY OFIdEmpres, OFHdr, OFHdrR, OFHdrP, OFFecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

