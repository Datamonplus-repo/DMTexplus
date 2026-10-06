package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultlinpro extends GXProcedure
{
   public pultlinpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultlinpro.class ), "" );
   }

   public pultlinpro( int remoteHandle ,
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
      pultlinpro.this.aP4 = new short[] {0};
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
      pultlinpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultlinpro.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pultlinpro.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pultlinpro.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pultlinpro.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04PS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1272UltLinPro = P04PS2_A1272UltLinPro[0] ;
         A11507RecAva = P04PS2_A11507RecAva[0] ;
         n11507RecAva = P04PS2_n11507RecAva[0] ;
         AV8RecLinPro = (byte)(0) ;
         /* Using cursor P04PS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1273RecLinPro = P04PS3_A1273RecLinPro[0] ;
            AV8RecLinPro = A1273RecLinPro ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( A1272UltLinPro != AV8RecLinPro )
         {
            A1272UltLinPro = AV8RecLinPro ;
         }
         A11507RecAva = httpContext.getMessage( "UPD", "") ;
         n11507RecAva = false ;
         /* Using cursor P04PS4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A1272UltLinPro), Boolean.valueOf(n11507RecAva), A11507RecAva, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultlinpro.this.A396EmprCod;
      this.aP1[0] = pultlinpro.this.A129BarCod;
      this.aP2[0] = pultlinpro.this.A132BarCodReo;
      this.aP3[0] = pultlinpro.this.A130BarCodPar;
      this.aP4[0] = pultlinpro.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pultlinpro");
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
      P04PS2_A396EmprCod = new String[] {""} ;
      P04PS2_A129BarCod = new int[1] ;
      P04PS2_A132BarCodReo = new byte[1] ;
      P04PS2_A130BarCodPar = new String[] {""} ;
      P04PS2_A2804RecLinMaq = new short[1] ;
      P04PS2_A1272UltLinPro = new byte[1] ;
      P04PS2_A11507RecAva = new String[] {""} ;
      P04PS2_n11507RecAva = new boolean[] {false} ;
      A11507RecAva = "" ;
      P04PS3_A396EmprCod = new String[] {""} ;
      P04PS3_A129BarCod = new int[1] ;
      P04PS3_A132BarCodReo = new byte[1] ;
      P04PS3_A130BarCodPar = new String[] {""} ;
      P04PS3_A2804RecLinMaq = new short[1] ;
      P04PS3_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultlinpro__default(),
         new Object[] {
             new Object[] {
            P04PS2_A396EmprCod, P04PS2_A129BarCod, P04PS2_A132BarCodReo, P04PS2_A130BarCodPar, P04PS2_A2804RecLinMaq, P04PS2_A1272UltLinPro, P04PS2_A11507RecAva, P04PS2_n11507RecAva
            }
            , new Object[] {
            P04PS3_A396EmprCod, P04PS3_A129BarCod, P04PS3_A132BarCodReo, P04PS3_A130BarCodPar, P04PS3_A2804RecLinMaq, P04PS3_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1272UltLinPro ;
   private byte AV8RecLinPro ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A11507RecAva ;
   private boolean n11507RecAva ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04PS2_A396EmprCod ;
   private int[] P04PS2_A129BarCod ;
   private byte[] P04PS2_A132BarCodReo ;
   private String[] P04PS2_A130BarCodPar ;
   private short[] P04PS2_A2804RecLinMaq ;
   private byte[] P04PS2_A1272UltLinPro ;
   private String[] P04PS2_A11507RecAva ;
   private boolean[] P04PS2_n11507RecAva ;
   private String[] P04PS3_A396EmprCod ;
   private int[] P04PS3_A129BarCod ;
   private byte[] P04PS3_A132BarCodReo ;
   private String[] P04PS3_A130BarCodPar ;
   private short[] P04PS3_A2804RecLinMaq ;
   private byte[] P04PS3_A1273RecLinPro ;
}

final  class pultlinpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, UltLinPro, RecAva FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04PS3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04PS4", "UPDATE TXPRECMAQ SET UltLinPro=?, RecAva=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

