package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelipar extends GXProcedure
{
   public pelipar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelipar.class ), "" );
   }

   public pelipar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 )
   {
      pelipar.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pelipar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelipar.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pelipar.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15ContLin = (byte)(0) ;
      /* Using cursor P00792 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A567HisProULin = P00792_A567HisProULin[0] ;
         n567HisProULin = P00792_n567HisProULin[0] ;
         /* Using cursor P00793 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A557HisProF = P00793_A557HisProF[0] ;
            A561HisProLin = P00793_A561HisProLin[0] ;
            AV15ContLin = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV15ContLin == 0 )
         {
            /* Using cursor P00794 */
            pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
         }
         else
         {
            /* Using cursor P00795 */
            pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A557HisProF = P00795_A557HisProF[0] ;
               A561HisProLin = P00795_A561HisProLin[0] ;
               AV16HisProULin = A561HisProLin ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            A567HisProULin = AV16HisProULin ;
            n567HisProULin = false ;
         }
         /* Using cursor P00796 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin), A396EmprCod, A602MaqCod, A558HisProFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelipar.this.A396EmprCod;
      this.aP1[0] = pelipar.this.A602MaqCod;
      this.aP2[0] = pelipar.this.A558HisProFec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelipar");
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
      P00792_A396EmprCod = new String[] {""} ;
      P00792_A602MaqCod = new String[] {""} ;
      P00792_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00792_A567HisProULin = new int[1] ;
      P00792_n567HisProULin = new boolean[] {false} ;
      P00793_A396EmprCod = new String[] {""} ;
      P00793_A602MaqCod = new String[] {""} ;
      P00793_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00793_A557HisProF = new String[] {""} ;
      P00793_A561HisProLin = new int[1] ;
      A557HisProF = "" ;
      P00795_A396EmprCod = new String[] {""} ;
      P00795_A602MaqCod = new String[] {""} ;
      P00795_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00795_A557HisProF = new String[] {""} ;
      P00795_A561HisProLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelipar__default(),
         new Object[] {
             new Object[] {
            P00792_A396EmprCod, P00792_A602MaqCod, P00792_A558HisProFec, P00792_A567HisProULin, P00792_n567HisProULin
            }
            , new Object[] {
            P00793_A396EmprCod, P00793_A602MaqCod, P00793_A558HisProFec, P00793_A557HisProF, P00793_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00795_A396EmprCod, P00795_A602MaqCod, P00795_A558HisProFec, P00795_A557HisProF, P00795_A561HisProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15ContLin ;
   private short Gx_err ;
   private int A567HisProULin ;
   private int A561HisProLin ;
   private int AV16HisProULin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String A557HisProF ;
   private java.util.Date A558HisProFec ;
   private boolean n567HisProULin ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00792_A396EmprCod ;
   private String[] P00792_A602MaqCod ;
   private java.util.Date[] P00792_A558HisProFec ;
   private int[] P00792_A567HisProULin ;
   private boolean[] P00792_n567HisProULin ;
   private String[] P00793_A396EmprCod ;
   private String[] P00793_A602MaqCod ;
   private java.util.Date[] P00793_A558HisProFec ;
   private String[] P00793_A557HisProF ;
   private int[] P00793_A561HisProLin ;
   private String[] P00795_A396EmprCod ;
   private String[] P00795_A602MaqCod ;
   private java.util.Date[] P00795_A558HisProFec ;
   private String[] P00795_A557HisProF ;
   private int[] P00795_A561HisProLin ;
}

final  class pelipar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00792", "SELECT EmprCod, MaqCod, HisProFec, HisProULin FROM TXPCHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00793", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProF, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00794", "DELETE FROM TXPCHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
         ,new ForEachCursor("P00795", "SELECT EmprCod, MaqCod, HisProFec, HisProF, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00796", "UPDATE TXPCHIPRO SET HisProULin=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
      }
   }

}

