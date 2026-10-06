package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplastlote extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplastlote pgm = new aplastlote (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aplastlote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplastlote.class ), "" );
   }

   public aplastlote( int remoteHandle ,
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
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      aplastlote.this.AV10EmprCod = GXv_char1[0] ;
      aplastlote.this.AV11EmprNom = GXv_char2[0] ;
      aplastlote.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV16Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      aplastlote.this.GXt_char4 = GXv_char3[0] ;
      AV16Carpeta = GXt_char4 ;
      GXt_char4 = AV16Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      aplastlote.this.GXt_char4 = GXv_char3[0] ;
      AV16Carpeta = ((GXutil.strcmp("", AV16Carpeta)==0) ? GXt_char4 : AV16Carpeta) ;
      AV15Nominf = GXutil.trim( AV24Pgmdesc) ;
      AV17File = GXutil.trim( AV16Carpeta) + "\\" + GXutil.trim( AV15Nominf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV17File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV19Stat = GXutil.deleteFile( AV17File) ;
      }
      GXt_int5 = AV18hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV17File, GXv_int6) ;
      aplastlote.this.GXt_int5 = GXv_int6[0] ;
      AV18hnd = (short)(GXt_int5) ;
      AV12Control = httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Lote", "") + ";" + httpContext.getMessage( "Lote Entrada Ultima", "") + ";" + httpContext.getMessage( "Data", "") ;
      GXt_int7 = (byte)(AV19Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV12Control, GXv_int8) ;
      aplastlote.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      System.out.println( AV12Control );
      /* Using cursor P05XG2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P05XG2_A856ValCod[0] ;
         A719PrdNum = P05XG2_A719PrdNum[0] ;
         A396EmprCod = P05XG2_A396EmprCod[0] ;
         A10881PrdLote = P05XG2_A10881PrdLote[0] ;
         A718PrdNom = P05XG2_A718PrdNom[0] ;
         AV13Prdnum = A719PrdNum ;
         /* Execute user subroutine: 'ENTALM' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV14EntLotN, httpContext.getMessage( "AJUSTE PRDEXIALM=STOCKREM ", "")) == 0 ) || (GXutil.strcmp("", AV14EntLotN)==0) )
         {
         }
         else
         {
            AV12Control = A719PrdNum + ";" + A718PrdNom + ";" + A10881PrdLote + ";" + AV14EntLotN + ";" + localUtil.dtoc( AV20EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( AV12Control );
            GXt_int7 = (byte)(AV19Stat) ;
            GXv_int8[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV12Control, GXv_int8) ;
            aplastlote.this.GXt_int7 = GXv_int8[0] ;
            AV19Stat = GXt_int7 ;
            A10881PrdLote = ((GXutil.strcmp(AV14EntLotN, A10881PrdLote)!=0) ? AV14EntLotN : A10881PrdLote) ;
         }
         /* Using cursor P05XG3 */
         pr_default.execute(1, new Object[] {A10881PrdLote, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV19Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV18hnd, GXv_int8) ;
      aplastlote.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      AV14EntLotN = " " ;
      AV20EntFecEnt = GXutil.nullDate() ;
      /* Using cursor P05XG4 */
      pr_default.execute(2, new Object[] {AV10EmprCod, AV13Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05XG4_A396EmprCod[0] ;
         A719PrdNum = P05XG4_A719PrdNum[0] ;
         A5686EntLotN = P05XG4_A5686EntLotN[0] ;
         A411EntCon = P05XG4_A411EntCon[0] ;
         A415EntFecEnt = P05XG4_A415EntFecEnt[0] ;
         A597LinEnt = P05XG4_A597LinEnt[0] ;
         AV14EntLotN = A5686EntLotN ;
         AV20EntFecEnt = A415EntFecEnt ;
         AV21EntCon = A411EntCon ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plastlote.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aplastlote");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV16Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV15Nominf = "" ;
      AV24Pgmdesc = "" ;
      AV17File = "" ;
      GXv_int6 = new long[1] ;
      AV12Control = "" ;
      scmdbuf = "" ;
      P05XG2_A856ValCod = new byte[1] ;
      P05XG2_A719PrdNum = new String[] {""} ;
      P05XG2_A396EmprCod = new String[] {""} ;
      P05XG2_A10881PrdLote = new String[] {""} ;
      P05XG2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A10881PrdLote = "" ;
      A718PrdNom = "" ;
      AV13Prdnum = "" ;
      AV14EntLotN = "" ;
      AV20EntFecEnt = GXutil.nullDate() ;
      GXv_int8 = new byte[1] ;
      P05XG4_A396EmprCod = new String[] {""} ;
      P05XG4_A719PrdNum = new String[] {""} ;
      P05XG4_A5686EntLotN = new String[] {""} ;
      P05XG4_A411EntCon = new byte[1] ;
      P05XG4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05XG4_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplastlote__default(),
         new Object[] {
             new Object[] {
            P05XG2_A856ValCod, P05XG2_A719PrdNum, P05XG2_A396EmprCod, P05XG2_A10881PrdLote, P05XG2_A718PrdNom
            }
            , new Object[] {
            }
            , new Object[] {
            P05XG4_A396EmprCod, P05XG4_A719PrdNum, P05XG4_A5686EntLotN, P05XG4_A411EntCon, P05XG4_A415EntFecEnt, P05XG4_A597LinEnt
            }
         }
      );
      AV24Pgmdesc = httpContext.getMessage( "Last Lote", "") ;
      /* GeneXus formulas. */
      AV24Pgmdesc = httpContext.getMessage( "Last Lote", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte A411EntCon ;
   private byte AV21EntCon ;
   private short AV19Stat ;
   private short AV18hnd ;
   private short A597LinEnt ;
   private short Gx_err ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV16Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV15Nominf ;
   private String AV24Pgmdesc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A10881PrdLote ;
   private String A718PrdNom ;
   private String AV13Prdnum ;
   private String AV14EntLotN ;
   private String A5686EntLotN ;
   private java.util.Date AV20EntFecEnt ;
   private java.util.Date A415EntFecEnt ;
   private boolean Cond_result ;
   private boolean returnInSub ;
   private String AV17File ;
   private String AV12Control ;
   private IDataStoreProvider pr_default ;
   private byte[] P05XG2_A856ValCod ;
   private String[] P05XG2_A719PrdNum ;
   private String[] P05XG2_A396EmprCod ;
   private String[] P05XG2_A10881PrdLote ;
   private String[] P05XG2_A718PrdNom ;
   private String[] P05XG4_A396EmprCod ;
   private String[] P05XG4_A719PrdNum ;
   private String[] P05XG4_A5686EntLotN ;
   private byte[] P05XG4_A411EntCon ;
   private java.util.Date[] P05XG4_A415EntFecEnt ;
   private short[] P05XG4_A597LinEnt ;
}

final  class aplastlote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XG2", "SELECT ValCod, PrdNum, EmprCod, PrdLote, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= '100000') AND (ValCod = 1) AND (PrdNum <= '999999') ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05XG3", "UPDATE TXPPRODUC SET PrdLote=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P05XG4", "SELECT * FROM (SELECT EmprCod, PrdNum, EntLotN, EntCon, EntFecEnt, LinEnt FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, EntFecEnt DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

