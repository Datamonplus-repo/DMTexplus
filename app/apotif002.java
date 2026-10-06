package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apotif002 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apotif002 pgm = new apotif002 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apotif002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apotif002.class ), "" );
   }

   public apotif002( int remoteHandle ,
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
      AV59UsurCod = " " ;
      AV60Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV64EmprCod ;
      GXv_char2[0] = AV71EmprNom ;
      GXv_char3[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char1, GXv_char2, GXv_char3) ;
      apotif002.this.AV64EmprCod = GXv_char1[0] ;
      apotif002.this.AV71EmprNom = GXv_char2[0] ;
      apotif002.this.AV59UsurCod = GXv_char3[0] ;
      GXt_char4 = AV104ddmmaaaa ;
      GXv_char3[0] = AV64EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apotif002.this.AV64EmprCod = GXv_char3[0] ;
      apotif002.this.GXt_char4 = GXv_char1[0] ;
      AV104ddmmaaaa = GXt_char4 ;
      AV61Fec1 = ((GXutil.strcmp("", AV104ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV104ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV104ddmmaaaa ;
      GXv_char3[0] = AV64EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apotif002.this.AV64EmprCod = GXv_char3[0] ;
      apotif002.this.GXt_char4 = GXv_char1[0] ;
      AV104ddmmaaaa = GXt_char4 ;
      AV62Fec2 = ((GXutil.strcmp("", AV104ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV104ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV61Fec1 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61Fec1)) ? GXutil.today( ) : AV61Fec1) ;
      AV62Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Fec2)) ? GXutil.today( ) : AV62Fec2) ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV64EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      apotif002.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = GXt_char4 ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apotif002.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = ((GXutil.strcmp("", AV63Carpeta)==0) ? GXt_char4 : AV63Carpeta) ;
      AV65NomInf = httpContext.getMessage( "OTIF-DATOS v0", "") ;
      AV66File = GXutil.trim( AV63Carpeta) + "\\" + GXutil.trim( AV65NomInf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV66File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV70Stat = GXutil.deleteFile( AV66File) ;
      }
      GXt_int5 = AV69hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV66File, GXv_int6) ;
      apotif002.this.GXt_int5 = GXv_int6[0] ;
      AV69hnd = GXt_int5 ;
      AV67Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Año", "") + ";" + httpContext.getMessage( "Mes", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Cumplidas", "") + ";" + httpContext.getMessage( "Incumplidas", "") ;
      GXt_int7 = AV70Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV69hnd, AV67Control, GXv_int8) ;
      apotif002.this.GXt_int7 = GXv_int8[0] ;
      AV70Stat = GXt_int7 ;
      /* Using cursor P05IE2 */
      pr_default.execute(0, new Object[] {AV64EmprCod, AV61Fec1, AV62Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12782OFFecha = P05IE2_A12782OFFecha[0] ;
         A12781OFIdEmpres = P05IE2_A12781OFIdEmpres[0] ;
         A12788OFHdrs = P05IE2_A12788OFHdrs[0] ;
         n12788OFHdrs = P05IE2_n12788OFHdrs[0] ;
         A12787OFSecion = P05IE2_A12787OFSecion[0] ;
         n12787OFSecion = P05IE2_n12787OFSecion[0] ;
         A12786OFMes = P05IE2_A12786OFMes[0] ;
         n12786OFMes = P05IE2_n12786OFMes[0] ;
         A12785OFAnyo = P05IE2_A12785OFAnyo[0] ;
         n12785OFAnyo = P05IE2_n12785OFAnyo[0] ;
         A12790OFIncumpli = P05IE2_A12790OFIncumpli[0] ;
         n12790OFIncumpli = P05IE2_n12790OFIncumpli[0] ;
         A12789OFCumplida = P05IE2_A12789OFCumplida[0] ;
         n12789OFCumplida = P05IE2_n12789OFCumplida[0] ;
         A12783OFIdSeccio = P05IE2_A12783OFIdSeccio[0] ;
         AV99Nhdrs = (int)(AV101NhdrsnoOk+AV100Nhdrsok) ;
         AV67Control = A12781OFIdEmpres + ";" + GXutil.trim( localUtil.dtoc( A12782OFFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + A12783OFIdSeccio + ";" + A12781OFIdEmpres + A12783OFIdSeccio + ";" + GXutil.str( A12785OFAnyo, 4, 0) + ";" + GXutil.str( A12786OFMes, 2, 0) + ";" + A12787OFSecion + ";" + GXutil.str( A12788OFHdrs, 6, 0) + ";" ;
         AV67Control += GXutil.str( A12789OFCumplida, 6, 0) + ";" + GXutil.str( A12790OFIncumpli, 6, 0) ;
         GXt_int7 = AV70Stat ;
         GXv_int8[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV69hnd, AV67Control, GXv_int8) ;
         apotif002.this.GXt_int7 = GXv_int8[0] ;
         AV70Stat = GXt_int7 ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = AV70Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV69hnd, GXv_int8) ;
      apotif002.this.GXt_int7 = GXv_int8[0] ;
      AV70Stat = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(potif002.class);
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
      AV59UsurCod = "" ;
      AV60Station = "" ;
      AV64EmprCod = "" ;
      AV71EmprNom = "" ;
      AV104ddmmaaaa = "" ;
      AV61Fec1 = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV62Fec2 = GXutil.nullDate() ;
      AV63Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV65NomInf = "" ;
      AV66File = "" ;
      GXv_int6 = new long[1] ;
      AV67Control = "" ;
      scmdbuf = "" ;
      P05IE2_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P05IE2_A12781OFIdEmpres = new String[] {""} ;
      P05IE2_A12788OFHdrs = new int[1] ;
      P05IE2_n12788OFHdrs = new boolean[] {false} ;
      P05IE2_A12787OFSecion = new String[] {""} ;
      P05IE2_n12787OFSecion = new boolean[] {false} ;
      P05IE2_A12786OFMes = new byte[1] ;
      P05IE2_n12786OFMes = new boolean[] {false} ;
      P05IE2_A12785OFAnyo = new short[1] ;
      P05IE2_n12785OFAnyo = new boolean[] {false} ;
      P05IE2_A12790OFIncumpli = new int[1] ;
      P05IE2_n12790OFIncumpli = new boolean[] {false} ;
      P05IE2_A12789OFCumplida = new int[1] ;
      P05IE2_n12789OFCumplida = new boolean[] {false} ;
      P05IE2_A12783OFIdSeccio = new String[] {""} ;
      A12782OFFecha = GXutil.nullDate() ;
      A12781OFIdEmpres = "" ;
      A12787OFSecion = "" ;
      A12783OFIdSeccio = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apotif002__default(),
         new Object[] {
             new Object[] {
            P05IE2_A12782OFFecha, P05IE2_A12781OFIdEmpres, P05IE2_A12788OFHdrs, P05IE2_n12788OFHdrs, P05IE2_A12787OFSecion, P05IE2_n12787OFSecion, P05IE2_A12786OFMes, P05IE2_n12786OFMes, P05IE2_A12785OFAnyo, P05IE2_n12785OFAnyo,
            P05IE2_A12790OFIncumpli, P05IE2_n12790OFIncumpli, P05IE2_A12789OFCumplida, P05IE2_n12789OFCumplida, P05IE2_A12783OFIdSeccio
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV70Stat ;
   private byte A12786OFMes ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short A12785OFAnyo ;
   private short Gx_err ;
   private int A12788OFHdrs ;
   private int A12790OFIncumpli ;
   private int A12789OFCumplida ;
   private int AV99Nhdrs ;
   private int AV101NhdrsnoOk ;
   private int AV100Nhdrsok ;
   private long AV69hnd ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String AV59UsurCod ;
   private String AV60Station ;
   private String AV64EmprCod ;
   private String AV71EmprNom ;
   private String AV104ddmmaaaa ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV63Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV65NomInf ;
   private String scmdbuf ;
   private String A12781OFIdEmpres ;
   private String A12787OFSecion ;
   private String A12783OFIdSeccio ;
   private java.util.Date AV61Fec1 ;
   private java.util.Date AV62Fec2 ;
   private java.util.Date A12782OFFecha ;
   private boolean Cond_result ;
   private boolean n12788OFHdrs ;
   private boolean n12787OFSecion ;
   private boolean n12786OFMes ;
   private boolean n12785OFAnyo ;
   private boolean n12790OFIncumpli ;
   private boolean n12789OFCumplida ;
   private String AV66File ;
   private String AV67Control ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P05IE2_A12782OFFecha ;
   private String[] P05IE2_A12781OFIdEmpres ;
   private int[] P05IE2_A12788OFHdrs ;
   private boolean[] P05IE2_n12788OFHdrs ;
   private String[] P05IE2_A12787OFSecion ;
   private boolean[] P05IE2_n12787OFSecion ;
   private byte[] P05IE2_A12786OFMes ;
   private boolean[] P05IE2_n12786OFMes ;
   private short[] P05IE2_A12785OFAnyo ;
   private boolean[] P05IE2_n12785OFAnyo ;
   private int[] P05IE2_A12790OFIncumpli ;
   private boolean[] P05IE2_n12790OFIncumpli ;
   private int[] P05IE2_A12789OFCumplida ;
   private boolean[] P05IE2_n12789OFCumplida ;
   private String[] P05IE2_A12783OFIdSeccio ;
}

final  class apotif002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05IE2", "SELECT OFFecha, OFIdEmpres, OFHdrs, OFSecion, OFMes, OFAnyo, OFIncumpli, OFCumplida, OFIdSeccio FROM TXPOTIF WHERE (OFIdEmpres = ? and OFFecha >= ?) AND (OFFecha <= ?) ORDER BY OFIdEmpres, OFFecha, OFIdSeccio ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 2);
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

