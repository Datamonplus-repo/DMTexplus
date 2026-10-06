package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrarmaqhnp extends GXProcedure
{
   public registrarmaqhnp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrarmaqhnp.class ), "" );
   }

   public registrarmaqhnp( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             byte aP3 )
   {
      registrarmaqhnp.this.AV20EmprCod = aP0;
      registrarmaqhnp.this.AV10MaqCod = aP1;
      registrarmaqhnp.this.AV9CalendarioMaquinaAnualidad = aP2;
      registrarmaqhnp.this.AV11CalendarioMaquinaMes = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24GXLvl1 = (byte)(0) ;
      /* Using cursor P083O2 */
      pr_default.execute(0, new Object[] {AV20EmprCod, AV10MaqCod, Short.valueOf(AV9CalendarioMaquinaAnualidad), Byte.valueOf(AV11CalendarioMaquinaMes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P083O2_A614MaqMes[0] ;
         A599MaqAny = P083O2_A599MaqAny[0] ;
         A602MaqCod = P083O2_A602MaqCod[0] ;
         A396EmprCod = P083O2_A396EmprCod[0] ;
         AV24GXLvl1 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV24GXLvl1 == 0 )
      {
         AV21MaqHNPMes = " " ;
         /*
            INSERT RECORD ON TABLE TXPMAQHNP

         */
         A396EmprCod = AV20EmprCod ;
         A602MaqCod = AV10MaqCod ;
         A599MaqAny = AV9CalendarioMaquinaAnualidad ;
         A614MaqMes = AV11CalendarioMaquinaMes ;
         A610MaqHNPMes = GXutil.padl( AV21MaqHNPMes, (short)(63), " ") ;
         n610MaqHNPMes = false ;
         /* Using cursor P083O3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
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
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.registrarmaqhnp");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.registrarmaqhnp");
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
      P083O2_A614MaqMes = new byte[1] ;
      P083O2_A599MaqAny = new short[1] ;
      P083O2_A602MaqCod = new String[] {""} ;
      P083O2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      AV21MaqHNPMes = "" ;
      A610MaqHNPMes = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.registrarmaqhnp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.registrarmaqhnp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.registrarmaqhnp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.registrarmaqhnp__default(),
         new Object[] {
             new Object[] {
            P083O2_A614MaqMes, P083O2_A599MaqAny, P083O2_A602MaqCod, P083O2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11CalendarioMaquinaMes ;
   private byte AV24GXLvl1 ;
   private byte A614MaqMes ;
   private short AV9CalendarioMaquinaAnualidad ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int GX_INS67 ;
   private String AV20EmprCod ;
   private String AV10MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n610MaqHNPMes ;
   private String AV21MaqHNPMes ;
   private String A610MaqHNPMes ;
   private IDataStoreProvider pr_default ;
   private byte[] P083O2_A614MaqMes ;
   private short[] P083O2_A599MaqAny ;
   private String[] P083O2_A602MaqCod ;
   private String[] P083O2_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class registrarmaqhnp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class registrarmaqhnp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class registrarmaqhnp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class registrarmaqhnp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P083O2", "SELECT * FROM (SELECT MaqMes, MaqAny, MaqCod, EmprCod FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P083O3", "INSERT INTO TXPMAQHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHNPMes) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 63);
               }
               return;
      }
   }

}

