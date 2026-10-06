package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pininotultlin extends GXProcedure
{
   public pininotultlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pininotultlin.class ), "" );
   }

   public pininotultlin( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pininotultlin.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pininotultlin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pininotultlin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pininotultlin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pininotultlin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P06052 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A646NotUltLin = P06052_A646NotUltLin[0] ;
         n646NotUltLin = P06052_n646NotUltLin[0] ;
         AV8BarNotLin = (byte)(0) ;
         /* Using cursor P06053 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A188BarNotLin = P06053_A188BarNotLin[0] ;
            AV8BarNotLin = A188BarNotLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A646NotUltLin = AV8BarNotLin ;
         n646NotUltLin = false ;
         /* Using cursor P06054 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pininotultlin.this.A396EmprCod;
      this.aP1[0] = pininotultlin.this.A129BarCod;
      this.aP2[0] = pininotultlin.this.A132BarCodReo;
      this.aP3[0] = pininotultlin.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pininotultlin");
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
      P06052_A396EmprCod = new String[] {""} ;
      P06052_A129BarCod = new int[1] ;
      P06052_A132BarCodReo = new byte[1] ;
      P06052_A130BarCodPar = new String[] {""} ;
      P06052_A646NotUltLin = new byte[1] ;
      P06052_n646NotUltLin = new boolean[] {false} ;
      P06053_A396EmprCod = new String[] {""} ;
      P06053_A129BarCod = new int[1] ;
      P06053_A132BarCodReo = new byte[1] ;
      P06053_A130BarCodPar = new String[] {""} ;
      P06053_A188BarNotLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pininotultlin__default(),
         new Object[] {
             new Object[] {
            P06052_A396EmprCod, P06052_A129BarCod, P06052_A132BarCodReo, P06052_A130BarCodPar, P06052_A646NotUltLin, P06052_n646NotUltLin
            }
            , new Object[] {
            P06053_A396EmprCod, P06053_A129BarCod, P06053_A132BarCodReo, P06053_A130BarCodPar, P06053_A188BarNotLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A646NotUltLin ;
   private byte AV8BarNotLin ;
   private byte A188BarNotLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n646NotUltLin ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P06052_A396EmprCod ;
   private int[] P06052_A129BarCod ;
   private byte[] P06052_A132BarCodReo ;
   private String[] P06052_A130BarCodPar ;
   private byte[] P06052_A646NotUltLin ;
   private boolean[] P06052_n646NotUltLin ;
   private String[] P06053_A396EmprCod ;
   private int[] P06053_A129BarCod ;
   private byte[] P06053_A132BarCodReo ;
   private String[] P06053_A130BarCodPar ;
   private byte[] P06053_A188BarNotLin ;
}

final  class pininotultlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06052", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, NotUltLin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06053", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P06054", "UPDATE TXPBARCAD SET NotUltLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

