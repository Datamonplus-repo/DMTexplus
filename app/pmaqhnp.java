package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqhnp extends GXProcedure
{
   public pmaqhnp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqhnp.class ), "" );
   }

   public pmaqhnp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 )
   {
      pmaqhnp.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 )
   {
      pmaqhnp.this.AV11EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqhnp.this.AV10Maqcod = aP1[0];
      this.aP1 = aP1;
      pmaqhnp.this.AV8MaqAny = aP2[0];
      this.aP2 = aP2;
      pmaqhnp.this.AV9MaqMes = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P04EJ2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, AV10Maqcod, Short.valueOf(AV8MaqAny), Byte.valueOf(AV9MaqMes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P04EJ2_A614MaqMes[0] ;
         A599MaqAny = P04EJ2_A599MaqAny[0] ;
         A602MaqCod = P04EJ2_A602MaqCod[0] ;
         A396EmprCod = P04EJ2_A396EmprCod[0] ;
         AV14GXLvl1 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMAQHNP

         */
         A396EmprCod = AV11EmprCod ;
         A602MaqCod = AV10Maqcod ;
         A599MaqAny = AV8MaqAny ;
         A614MaqMes = AV9MaqMes ;
         A610MaqHNPMes = "" ;
         n610MaqHNPMes = false ;
         /* Using cursor P04EJ3 */
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqhnp.this.AV11EmprCod;
      this.aP1[0] = pmaqhnp.this.AV10Maqcod;
      this.aP2[0] = pmaqhnp.this.AV8MaqAny;
      this.aP3[0] = pmaqhnp.this.AV9MaqMes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmaqhnp");
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
      P04EJ2_A614MaqMes = new byte[1] ;
      P04EJ2_A599MaqAny = new short[1] ;
      P04EJ2_A602MaqCod = new String[] {""} ;
      P04EJ2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A610MaqHNPMes = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqhnp__default(),
         new Object[] {
             new Object[] {
            P04EJ2_A614MaqMes, P04EJ2_A599MaqAny, P04EJ2_A602MaqCod, P04EJ2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9MaqMes ;
   private byte AV14GXLvl1 ;
   private byte A614MaqMes ;
   private short AV8MaqAny ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int GX_INS67 ;
   private String AV11EmprCod ;
   private String AV10Maqcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P04EJ2_A614MaqMes ;
   private short[] P04EJ2_A599MaqAny ;
   private String[] P04EJ2_A602MaqCod ;
   private String[] P04EJ2_A396EmprCod ;
}

final  class pmaqhnp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EJ2", "SELECT MaqMes, MaqAny, MaqCod, EmprCod FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04EJ3", "INSERT INTO TXPMAQHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHNPMes) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
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

