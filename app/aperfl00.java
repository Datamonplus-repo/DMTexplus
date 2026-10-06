package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aperfl00 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aperfl00 pgm = new aperfl00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aperfl00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aperfl00.class ), "" );
   }

   public aperfl00( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Iniciamos", "") );
      AV20Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV22Emprcod ;
      GXv_char2[0] = AV23EmprNom ;
      GXv_char3[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char1, GXv_char2, GXv_char3) ;
      aperfl00.this.AV22Emprcod = GXv_char1[0] ;
      aperfl00.this.AV23EmprNom = GXv_char2[0] ;
      aperfl00.this.AV21Usurcod = GXv_char3[0] ;
      /* Using cursor P02LH2 */
      pr_default.execute(0, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P02LH2_A5532Lb_numero[0] ;
         A396EmprCod = P02LH2_A396EmprCod[0] ;
         A252CliCod = P02LH2_A252CliCod[0] ;
         A5533Lb_ArtCod = P02LH2_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P02LH2_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P02LH2_A5537Lb_ColNum[0] ;
         A831TipColCod = P02LH2_A831TipColCod[0] ;
         n831TipColCod = P02LH2_n831TipColCod[0] ;
         AV24CliCod = A252CliCod ;
         AV25ForSer = A5533Lb_ArtCod ;
         AV26Forcolnom = A5536Lb_ColNom ;
         AV27Forcolnum = A5537Lb_ColNum ;
         AV28TipColCod = A831TipColCod ;
         /* Using cursor P02LH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5563Lb_FechaR = P02LH3_A5563Lb_FechaR[0] ;
            A5564Lb_HoraR = P02LH3_A5564Lb_HoraR[0] ;
            A5566Lb_Estado = P02LH3_A5566Lb_Estado[0] ;
            A5567Lb_FechaEn = P02LH3_A5567Lb_FechaEn[0] ;
            A5555Lb_opcion = P02LH3_A5555Lb_opcion[0] ;
            A5563Lb_FechaR = GXutil.nullDate() ;
            A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
            A5566Lb_Estado = (byte)(0) ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
            {
               A5566Lb_Estado = (byte)(1) ;
            }
            /* Using cursor P02LH4 */
            pr_default.execute(2, new Object[] {A5563Lb_FechaR, A5564Lb_HoraR, Byte.valueOf(A5566Lb_Estado), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Application.commitDataStores(context, remoteHandle, pr_default, "aperfl00");
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV29Fornumarc > 0 )
         {
            /* Using cursor P02LH5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5563Lb_FechaR = P02LH5_A5563Lb_FechaR[0] ;
               A5566Lb_Estado = P02LH5_A5566Lb_Estado[0] ;
               A5555Lb_opcion = P02LH5_A5555Lb_opcion[0] ;
               if ( GXutil.strcmp(A5555Lb_opcion, AV30FOROPCCLI) == 0 )
               {
                  A5563Lb_FechaR = AV31FORFECAPR ;
                  A5566Lb_Estado = (byte)(2) ;
                  Gx_msg = httpContext.getMessage( "Lb_numero=", "") + GXutil.str( A5532Lb_numero, 8, 0) + A5555Lb_opcion ;
                  System.out.println( Gx_msg );
               }
               else
               {
                  A5566Lb_Estado = (byte)(2) ;
               }
               /* Using cursor P02LH6 */
               pr_default.execute(4, new Object[] {A5563Lb_FechaR, Byte.valueOf(A5566Lb_Estado), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV29Fornumarc = 0 ;
      AV30FOROPCCLI = " " ;
      /* Using cursor P02LH7 */
      pr_default.execute(5, new Object[] {AV22Emprcod, Integer.valueOf(AV24CliCod), AV25ForSer, AV26Forcolnom, Integer.valueOf(AV27Forcolnum), Byte.valueOf(AV28TipColCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A831TipColCod = P02LH7_A831TipColCod[0] ;
         n831TipColCod = P02LH7_n831TipColCod[0] ;
         A483ForColNum = P02LH7_A483ForColNum[0] ;
         A482ForColNom = P02LH7_A482ForColNom[0] ;
         A494ForSer = P02LH7_A494ForSer[0] ;
         A252CliCod = P02LH7_A252CliCod[0] ;
         A396EmprCod = P02LH7_A396EmprCod[0] ;
         A3315ForNumArc = P02LH7_A3315ForNumArc[0] ;
         n3315ForNumArc = P02LH7_n3315ForNumArc[0] ;
         A3560ForOpcCli = P02LH7_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P02LH7_n3560ForOpcCli[0] ;
         A3558ForFecApr = P02LH7_A3558ForFecApr[0] ;
         n3558ForFecApr = P02LH7_n3558ForFecApr[0] ;
         AV29Fornumarc = A3315ForNumArc ;
         AV30FOROPCCLI = A3560ForOpcCli ;
         AV31FORFECAPR = A3558ForFecApr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(perfl00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aperfl00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Station = "" ;
      AV22Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02LH2_A5532Lb_numero = new int[1] ;
      P02LH2_A396EmprCod = new String[] {""} ;
      P02LH2_A252CliCod = new int[1] ;
      P02LH2_A5533Lb_ArtCod = new String[] {""} ;
      P02LH2_A5536Lb_ColNom = new String[] {""} ;
      P02LH2_A5537Lb_ColNum = new int[1] ;
      P02LH2_A831TipColCod = new byte[1] ;
      P02LH2_n831TipColCod = new boolean[] {false} ;
      A396EmprCod = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      AV25ForSer = "" ;
      AV26Forcolnom = "" ;
      P02LH3_A396EmprCod = new String[] {""} ;
      P02LH3_A5532Lb_numero = new int[1] ;
      P02LH3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02LH3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P02LH3_A5566Lb_Estado = new byte[1] ;
      P02LH3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02LH3_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      P02LH5_A396EmprCod = new String[] {""} ;
      P02LH5_A5532Lb_numero = new int[1] ;
      P02LH5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02LH5_A5566Lb_Estado = new byte[1] ;
      P02LH5_A5555Lb_opcion = new String[] {""} ;
      AV30FOROPCCLI = "" ;
      AV31FORFECAPR = GXutil.nullDate() ;
      Gx_msg = "" ;
      P02LH7_A831TipColCod = new byte[1] ;
      P02LH7_n831TipColCod = new boolean[] {false} ;
      P02LH7_A483ForColNum = new int[1] ;
      P02LH7_A482ForColNom = new String[] {""} ;
      P02LH7_A494ForSer = new String[] {""} ;
      P02LH7_A252CliCod = new int[1] ;
      P02LH7_A396EmprCod = new String[] {""} ;
      P02LH7_A3315ForNumArc = new int[1] ;
      P02LH7_n3315ForNumArc = new boolean[] {false} ;
      P02LH7_A3560ForOpcCli = new String[] {""} ;
      P02LH7_n3560ForOpcCli = new boolean[] {false} ;
      P02LH7_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P02LH7_n3558ForFecApr = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.aperfl00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.aperfl00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.aperfl00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aperfl00__default(),
         new Object[] {
             new Object[] {
            P02LH2_A5532Lb_numero, P02LH2_A396EmprCod, P02LH2_A252CliCod, P02LH2_A5533Lb_ArtCod, P02LH2_A5536Lb_ColNom, P02LH2_A5537Lb_ColNum, P02LH2_A831TipColCod, P02LH2_n831TipColCod
            }
            , new Object[] {
            P02LH3_A396EmprCod, P02LH3_A5532Lb_numero, P02LH3_A5563Lb_FechaR, P02LH3_A5564Lb_HoraR, P02LH3_A5566Lb_Estado, P02LH3_A5567Lb_FechaEn, P02LH3_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            P02LH5_A396EmprCod, P02LH5_A5532Lb_numero, P02LH5_A5563Lb_FechaR, P02LH5_A5566Lb_Estado, P02LH5_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            P02LH7_A831TipColCod, P02LH7_A483ForColNum, P02LH7_A482ForColNom, P02LH7_A494ForSer, P02LH7_A252CliCod, P02LH7_A396EmprCod, P02LH7_A3315ForNumArc, P02LH7_n3315ForNumArc, P02LH7_A3560ForOpcCli, P02LH7_n3560ForOpcCli,
            P02LH7_A3558ForFecApr, P02LH7_n3558ForFecApr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV28TipColCod ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV24CliCod ;
   private int AV27Forcolnum ;
   private int AV29Fornumarc ;
   private int A483ForColNum ;
   private int A3315ForNumArc ;
   private String AV20Station ;
   private String AV22Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV21Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String AV25ForSer ;
   private String AV26Forcolnom ;
   private String A5555Lb_opcion ;
   private String AV30FOROPCCLI ;
   private String Gx_msg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A3560ForOpcCli ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV31FORFECAPR ;
   private java.util.Date A3558ForFecApr ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean n3315ForNumArc ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private IDataStoreProvider pr_default ;
   private int[] P02LH2_A5532Lb_numero ;
   private String[] P02LH2_A396EmprCod ;
   private int[] P02LH2_A252CliCod ;
   private String[] P02LH2_A5533Lb_ArtCod ;
   private String[] P02LH2_A5536Lb_ColNom ;
   private int[] P02LH2_A5537Lb_ColNum ;
   private byte[] P02LH2_A831TipColCod ;
   private boolean[] P02LH2_n831TipColCod ;
   private String[] P02LH3_A396EmprCod ;
   private int[] P02LH3_A5532Lb_numero ;
   private java.util.Date[] P02LH3_A5563Lb_FechaR ;
   private java.util.Date[] P02LH3_A5564Lb_HoraR ;
   private byte[] P02LH3_A5566Lb_Estado ;
   private java.util.Date[] P02LH3_A5567Lb_FechaEn ;
   private String[] P02LH3_A5555Lb_opcion ;
   private String[] P02LH5_A396EmprCod ;
   private int[] P02LH5_A5532Lb_numero ;
   private java.util.Date[] P02LH5_A5563Lb_FechaR ;
   private byte[] P02LH5_A5566Lb_Estado ;
   private String[] P02LH5_A5555Lb_opcion ;
   private byte[] P02LH7_A831TipColCod ;
   private boolean[] P02LH7_n831TipColCod ;
   private int[] P02LH7_A483ForColNum ;
   private String[] P02LH7_A482ForColNom ;
   private String[] P02LH7_A494ForSer ;
   private int[] P02LH7_A252CliCod ;
   private String[] P02LH7_A396EmprCod ;
   private int[] P02LH7_A3315ForNumArc ;
   private boolean[] P02LH7_n3315ForNumArc ;
   private String[] P02LH7_A3560ForOpcCli ;
   private boolean[] P02LH7_n3560ForOpcCli ;
   private java.util.Date[] P02LH7_A3558ForFecApr ;
   private boolean[] P02LH7_n3558ForFecApr ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class aperfl00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class aperfl00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class aperfl00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class aperfl00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LH2", "SELECT Lb_numero, EmprCod, CliCod, Lb_ArtCod, Lb_ColNom, Lb_ColNum, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero >= 1 ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LH3", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_HoraR, Lb_Estado, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LH4", "UPDATE TXPENS002 SET Lb_FechaR=?, Lb_HoraR=?, Lb_Estado=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new ForEachCursor("P02LH5", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_Estado, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LH6", "UPDATE TXPENS002 SET Lb_FechaR=?, Lb_Estado=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new ForEachCursor("P02LH7", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumArc, ForOpcCli, ForFecApr FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], true);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

