package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prelan4 extends GXProcedure
{
   public prelan4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prelan4.class ), "" );
   }

   public prelan4( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      prelan4.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      prelan4.this.AV35EmprCod = aP0[0];
      this.aP0 = aP0;
      prelan4.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      prelan4.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      prelan4.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      prelan4.this.AV26RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02EP2 */
      pr_default.execute(0, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02EP2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02EP2_A130BarCodPar[0] ;
         A132BarCodReo = P02EP2_A132BarCodReo[0] ;
         A129BarCod = P02EP2_A129BarCod[0] ;
         A396EmprCod = P02EP2_A396EmprCod[0] ;
         A1272UltLinPro = P02EP2_A1272UltLinPro[0] ;
         A4867RecFecMod = P02EP2_A4867RecFecMod[0] ;
         n4867RecFecMod = P02EP2_n4867RecFecMod[0] ;
         A4868RecUsrMod = P02EP2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P02EP2_n4868RecUsrMod[0] ;
         /* Using cursor P02EP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1273RecLinPro = P02EP3_A1273RecLinPro[0] ;
            AV28RecLinPro = A1273RecLinPro ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1272UltLinPro = AV28RecLinPro ;
         A4867RecFecMod = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n4867RecFecMod = false ;
         A4868RecUsrMod = AV29Usurcod ;
         n4868RecUsrMod = false ;
         /* Using cursor P02EP4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A1272UltLinPro), Boolean.valueOf(n4867RecFecMod), A4867RecFecMod, Boolean.valueOf(n4868RecUsrMod), A4868RecUsrMod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prelan4.this.AV35EmprCod;
      this.aP1[0] = prelan4.this.AV23BarCod;
      this.aP2[0] = prelan4.this.AV24BarCodReo;
      this.aP3[0] = prelan4.this.AV25BarCodPar;
      this.aP4[0] = prelan4.this.AV26RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "prelan4");
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
      P02EP2_A2804RecLinMaq = new short[1] ;
      P02EP2_A130BarCodPar = new String[] {""} ;
      P02EP2_A132BarCodReo = new byte[1] ;
      P02EP2_A129BarCod = new int[1] ;
      P02EP2_A396EmprCod = new String[] {""} ;
      P02EP2_A1272UltLinPro = new byte[1] ;
      P02EP2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P02EP2_n4867RecFecMod = new boolean[] {false} ;
      P02EP2_A4868RecUsrMod = new String[] {""} ;
      P02EP2_n4868RecUsrMod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      P02EP3_A396EmprCod = new String[] {""} ;
      P02EP3_A129BarCod = new int[1] ;
      P02EP3_A132BarCodReo = new byte[1] ;
      P02EP3_A130BarCodPar = new String[] {""} ;
      P02EP3_A2804RecLinMaq = new short[1] ;
      P02EP3_A1273RecLinPro = new byte[1] ;
      AV29Usurcod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prelan4__default(),
         new Object[] {
             new Object[] {
            P02EP2_A2804RecLinMaq, P02EP2_A130BarCodPar, P02EP2_A132BarCodReo, P02EP2_A129BarCod, P02EP2_A396EmprCod, P02EP2_A1272UltLinPro, P02EP2_A4867RecFecMod, P02EP2_n4867RecFecMod, P02EP2_A4868RecUsrMod, P02EP2_n4868RecUsrMod
            }
            , new Object[] {
            P02EP3_A396EmprCod, P02EP3_A129BarCod, P02EP3_A132BarCodReo, P02EP3_A130BarCodPar, P02EP3_A2804RecLinMaq, P02EP3_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private byte A1272UltLinPro ;
   private byte A1273RecLinPro ;
   private byte AV28RecLinPro ;
   private short AV26RecLinMaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private String AV35EmprCod ;
   private String AV25BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4868RecUsrMod ;
   private String AV29Usurcod ;
   private java.util.Date A4867RecFecMod ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P02EP2_A2804RecLinMaq ;
   private String[] P02EP2_A130BarCodPar ;
   private byte[] P02EP2_A132BarCodReo ;
   private int[] P02EP2_A129BarCod ;
   private String[] P02EP2_A396EmprCod ;
   private byte[] P02EP2_A1272UltLinPro ;
   private java.util.Date[] P02EP2_A4867RecFecMod ;
   private boolean[] P02EP2_n4867RecFecMod ;
   private String[] P02EP2_A4868RecUsrMod ;
   private boolean[] P02EP2_n4868RecUsrMod ;
   private String[] P02EP3_A396EmprCod ;
   private int[] P02EP3_A129BarCod ;
   private byte[] P02EP3_A132BarCodReo ;
   private String[] P02EP3_A130BarCodPar ;
   private short[] P02EP3_A2804RecLinMaq ;
   private byte[] P02EP3_A1273RecLinPro ;
}

final  class prelan4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EP2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, UltLinPro, RecFecMod, RecUsrMod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02EP3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02EP4", "UPDATE TXPRECMAQ SET UltLinPro=?, RecFecMod=?, RecUsrMod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               return;
      }
   }

}

