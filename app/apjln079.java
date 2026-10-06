package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln079 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln079 pgm = new apjln079 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln079( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln079.class ), "" );
   }

   public apjln079( int remoteHandle ,
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
      AV10Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV11EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV12Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
      apjln079.this.AV11EmprCod = GXv_char1[0] ;
      apjln079.this.AV13EmprNom = GXv_char2[0] ;
      apjln079.this.AV12Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Processando Tabla CCSTKS", "") );
      /* Using cursor P02302 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P02302_A719PrdNum[0] ;
         A396EmprCod = P02302_A396EmprCod[0] ;
         AV25Ccstklin = 0 ;
         AV27Tipmovcc = "" ;
         AV26PrdNum = A719PrdNum ;
         /* Using cursor P02303 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3345TipMovCc = P02303_A3345TipMovCc[0] ;
            A3342CCStkLin = P02303_A3342CCStkLin[0] ;
            if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) )
            {
               AV25Ccstklin = A3342CCStkLin ;
               AV27Tipmovcc = A3345TipMovCc ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV25Ccstklin > 0 )
         {
            Gx_msg = httpContext.getMessage( "PrdNum = ", "") + AV26PrdNum + " " + httpContext.getMessage( "&Ccstklin = ", "") + GXutil.str( AV25Ccstklin, 6, 0) + " " + httpContext.getMessage( "&Tipmovcc =", "") + AV27Tipmovcc ;
            System.out.println( Gx_msg );
            /* Execute user subroutine: 'CCSTKS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            Application.commitDataStores(context, remoteHandle, pr_default, "apjln079");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fim Processo", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P02304 */
      pr_default.execute(2, new Object[] {AV11EmprCod, AV26PrdNum, Long.valueOf(AV25Ccstklin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized DELETE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln079.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln079");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      AV11EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV12Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02302_A719PrdNum = new String[] {""} ;
      P02302_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      AV27Tipmovcc = "" ;
      AV26PrdNum = "" ;
      P02303_A396EmprCod = new String[] {""} ;
      P02303_A719PrdNum = new String[] {""} ;
      P02303_A3345TipMovCc = new String[] {""} ;
      P02303_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      Gx_msg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apjln079__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apjln079__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apjln079__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln079__default(),
         new Object[] {
             new Object[] {
            P02302_A719PrdNum, P02302_A396EmprCod
            }
            , new Object[] {
            P02303_A396EmprCod, P02303_A719PrdNum, P02303_A3345TipMovCc, P02303_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV25Ccstklin ;
   private long A3342CCStkLin ;
   private String AV10Station ;
   private String AV11EmprCod ;
   private String GXv_char1[] ;
   private String AV13EmprNom ;
   private String GXv_char2[] ;
   private String AV12Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV27Tipmovcc ;
   private String AV26PrdNum ;
   private String A3345TipMovCc ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P02302_A719PrdNum ;
   private String[] P02302_A396EmprCod ;
   private String[] P02303_A396EmprCod ;
   private String[] P02303_A719PrdNum ;
   private String[] P02303_A3345TipMovCc ;
   private long[] P02303_A3342CCStkLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apjln079__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class apjln079__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class apjln079__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class apjln079__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02302", "SELECT PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02303", "SELECT EmprCod, PrdNum, TipMovCc, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02304", "DELETE FROM TXPCCSTKS  WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkLin < ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((long[]) buf[3])[0] = rslt.getLong(4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

