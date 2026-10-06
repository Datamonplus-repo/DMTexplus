package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpmordenconversion extends GXProcedure
{
   public txpmordenconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpmordenconversion.class ), "" );
   }

   public txpmordenconversion( int remoteHandle ,
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
      /* Using cursor TXPMORDENC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14271PMTipoID = TXPMORDENC2_A14271PMTipoID[0] ;
         A9464OMNot = TXPMORDENC2_A9464OMNot[0] ;
         A9445OMEst = TXPMORDENC2_A9445OMEst[0] ;
         A9439OMFchCer = TXPMORDENC2_A9439OMFchCer[0] ;
         A9438OMFchPre = TXPMORDENC2_A9438OMFchPre[0] ;
         A9437OMUsuCre = TXPMORDENC2_A9437OMUsuCre[0] ;
         A9436OMFchCre = TXPMORDENC2_A9436OMFchCre[0] ;
         A9434OMOpeRes = TXPMORDENC2_A9434OMOpeRes[0] ;
         n9434OMOpeRes = TXPMORDENC2_n9434OMOpeRes[0] ;
         A9433OMTxt = TXPMORDENC2_A9433OMTxt[0] ;
         A9429PMCod = TXPMORDENC2_A9429PMCod[0] ;
         n9429PMCod = TXPMORDENC2_n9429PMCod[0] ;
         A9428SMCod = TXPMORDENC2_A9428SMCod[0] ;
         n9428SMCod = TXPMORDENC2_n9428SMCod[0] ;
         A9426OMMaqCod = TXPMORDENC2_A9426OMMaqCod[0] ;
         A9425OMCod = TXPMORDENC2_A9425OMCod[0] ;
         A396EmprCod = TXPMORDENC2_A396EmprCod[0] ;
         A14271PMTipoID = TXPMORDENC2_A14271PMTipoID[0] ;
         /*
            INSERT RECORD ON TABLE GXA1232

         */
         AV2EmprCod = A396EmprCod ;
         AV3OMCod = A9425OMCod ;
         AV4OMMaqCod = A9426OMMaqCod ;
         if ( TXPMORDENC2_n9428SMCod[0] )
         {
            AV5SMCod = 0 ;
            nV5SMCod = false ;
            nV5SMCod = true ;
         }
         else
         {
            AV5SMCod = A9428SMCod ;
            nV5SMCod = false ;
         }
         if ( TXPMORDENC2_n9429PMCod[0] )
         {
            AV6PMCod = 0 ;
            nV6PMCod = false ;
            nV6PMCod = true ;
         }
         else
         {
            AV6PMCod = A9429PMCod ;
            nV6PMCod = false ;
         }
         AV7OMTxt = A9433OMTxt ;
         if ( TXPMORDENC2_n9434OMOpeRes[0] )
         {
            AV8OMOpeRes = 0 ;
            nV8OMOpeRes = false ;
            nV8OMOpeRes = true ;
         }
         else
         {
            AV8OMOpeRes = A9434OMOpeRes ;
            nV8OMOpeRes = false ;
         }
         AV9OMFchCre = A9436OMFchCre ;
         AV10OMUsuCre = A9437OMUsuCre ;
         AV11OMFchPre = A9438OMFchPre ;
         AV12OMFchCer = A9439OMFchCer ;
         AV13OMEst = A9445OMEst ;
         AV14OMNot = A9464OMNot ;
         AV15OMPri = (byte)(0) ;
         if ( TXPMORDENC2_n14271PMTipoID[0] )
         {
            AV16OMTipoId = (short)(0) ;
            nV16OMTipoId = false ;
            nV16OMTipoId = true ;
         }
         else
         {
            AV16OMTipoId = A14271PMTipoID ;
            nV16OMTipoId = false ;
         }
         /* Using cursor TXPMORDENC3 */
         pr_default.execute(1, new Object[] {AV2EmprCod, Integer.valueOf(AV3OMCod), AV4OMMaqCod, Boolean.valueOf(nV5SMCod), Integer.valueOf(AV5SMCod), Boolean.valueOf(nV6PMCod), Integer.valueOf(AV6PMCod), AV7OMTxt, Boolean.valueOf(nV8OMOpeRes), Integer.valueOf(AV8OMOpeRes), AV9OMFchCre, AV10OMUsuCre, AV11OMFchPre, AV12OMFchCer, AV13OMEst, AV14OMNot, Byte.valueOf(AV15OMPri), Boolean.valueOf(nV16OMTipoId), Short.valueOf(AV16OMTipoId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA1232");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpmordenconversion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      TXPMORDENC2_A14271PMTipoID = new short[1] ;
      TXPMORDENC2_A9464OMNot = new String[] {""} ;
      TXPMORDENC2_A9445OMEst = new String[] {""} ;
      TXPMORDENC2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      TXPMORDENC2_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      TXPMORDENC2_A9437OMUsuCre = new String[] {""} ;
      TXPMORDENC2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      TXPMORDENC2_A9434OMOpeRes = new int[1] ;
      TXPMORDENC2_n9434OMOpeRes = new boolean[] {false} ;
      TXPMORDENC2_A9433OMTxt = new String[] {""} ;
      TXPMORDENC2_A9429PMCod = new int[1] ;
      TXPMORDENC2_n9429PMCod = new boolean[] {false} ;
      TXPMORDENC2_A9428SMCod = new int[1] ;
      TXPMORDENC2_n9428SMCod = new boolean[] {false} ;
      TXPMORDENC2_A9426OMMaqCod = new String[] {""} ;
      TXPMORDENC2_A9425OMCod = new int[1] ;
      TXPMORDENC2_A396EmprCod = new String[] {""} ;
      A9464OMNot = "" ;
      A9445OMEst = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9426OMMaqCod = "" ;
      A396EmprCod = "" ;
      AV2EmprCod = "" ;
      AV4OMMaqCod = "" ;
      AV7OMTxt = "" ;
      AV9OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV10OMUsuCre = "" ;
      AV11OMFchPre = GXutil.nullDate() ;
      AV12OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV13OMEst = "" ;
      AV14OMNot = "" ;
      TXPMORDENC2_n14271PMTipoID = new boolean[] {false} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpmordenconversion__default(),
         new Object[] {
             new Object[] {
            TXPMORDENC2_A14271PMTipoID, TXPMORDENC2_A9464OMNot, TXPMORDENC2_A9445OMEst, TXPMORDENC2_A9439OMFchCer, TXPMORDENC2_A9438OMFchPre, TXPMORDENC2_A9437OMUsuCre, TXPMORDENC2_A9436OMFchCre, TXPMORDENC2_A9434OMOpeRes, TXPMORDENC2_n9434OMOpeRes, TXPMORDENC2_A9433OMTxt,
            TXPMORDENC2_A9429PMCod, TXPMORDENC2_n9429PMCod, TXPMORDENC2_A9428SMCod, TXPMORDENC2_n9428SMCod, TXPMORDENC2_A9426OMMaqCod, TXPMORDENC2_A9425OMCod, TXPMORDENC2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15OMPri ;
   private short A14271PMTipoID ;
   private short AV16OMTipoId ;
   private short Gx_err ;
   private int A9434OMOpeRes ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int A9425OMCod ;
   private int GIGXA1232 ;
   private int AV3OMCod ;
   private int AV5SMCod ;
   private int AV6PMCod ;
   private int AV8OMOpeRes ;
   private String scmdbuf ;
   private String A9445OMEst ;
   private String A9437OMUsuCre ;
   private String A9426OMMaqCod ;
   private String A396EmprCod ;
   private String AV2EmprCod ;
   private String AV4OMMaqCod ;
   private String AV10OMUsuCre ;
   private String AV13OMEst ;
   private String Gx_emsg ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV9OMFchCre ;
   private java.util.Date AV12OMFchCer ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date AV11OMFchPre ;
   private boolean n9434OMOpeRes ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean nV5SMCod ;
   private boolean nV6PMCod ;
   private boolean nV8OMOpeRes ;
   private boolean nV16OMTipoId ;
   private String A9464OMNot ;
   private String A9433OMTxt ;
   private String AV7OMTxt ;
   private String AV14OMNot ;
   private IDataStoreProvider pr_default ;
   private short[] TXPMORDENC2_A14271PMTipoID ;
   private String[] TXPMORDENC2_A9464OMNot ;
   private String[] TXPMORDENC2_A9445OMEst ;
   private java.util.Date[] TXPMORDENC2_A9439OMFchCer ;
   private java.util.Date[] TXPMORDENC2_A9438OMFchPre ;
   private String[] TXPMORDENC2_A9437OMUsuCre ;
   private java.util.Date[] TXPMORDENC2_A9436OMFchCre ;
   private int[] TXPMORDENC2_A9434OMOpeRes ;
   private boolean[] TXPMORDENC2_n9434OMOpeRes ;
   private String[] TXPMORDENC2_A9433OMTxt ;
   private int[] TXPMORDENC2_A9429PMCod ;
   private boolean[] TXPMORDENC2_n9429PMCod ;
   private int[] TXPMORDENC2_A9428SMCod ;
   private boolean[] TXPMORDENC2_n9428SMCod ;
   private String[] TXPMORDENC2_A9426OMMaqCod ;
   private int[] TXPMORDENC2_A9425OMCod ;
   private String[] TXPMORDENC2_A396EmprCod ;
   private boolean[] TXPMORDENC2_n14271PMTipoID ;
}

final  class txpmordenconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPMORDENC2", "SELECT T2.PMTipoID, T1.OMNot, T1.OMEst, T1.OMFchCer, T1.OMFchPre, T1.OMUsuCre, T1.OMFchCre, T1.OMOpeRes, T1.OMTxt, T1.PMCod, T1.SMCod, T1.OMMaqCod, T1.OMCod, T1.EmprCod FROM (TXPMORDEN T1 LEFT JOIN TXPMPREVE T2 ON T2.EmprCod = T1.EmprCod AND T2.PMCod = T1.PMCod) ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPMORDENC3", "INSERT INTO GXA1232(EmprCod, OMCod, OMMaqCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot, OMPri, OMTipoId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "GXA1232")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setVarchar(6, (String)parms[7], 2000, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               stmt.setDateTime(8, (java.util.Date)parms[10], false);
               stmt.setString(9, (String)parms[11], 8);
               stmt.setDate(10, (java.util.Date)parms[12]);
               stmt.setDateTime(11, (java.util.Date)parms[13], false);
               stmt.setString(12, (String)parms[14], 1);
               stmt.setVarchar(13, (String)parms[15], 2000, false);
               stmt.setByte(14, ((Number) parms[16]).byteValue());
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[18]).shortValue());
               }
               return;
      }
   }

}

