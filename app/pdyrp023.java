package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp023 extends GXProcedure
{
   public pdyrp023( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp023.class ), "" );
   }

   public pdyrp023( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 )
   {
      pdyrp023.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 )
   {
      pdyrp023.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp023.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp023.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp023.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp023.this.AV8NumRecs = aP4[0];
      this.aP4 = aP4;
      pdyrp023.this.AV9RecLinMaq = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P099G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2806RecFA = P099G2_A2806RecFA[0] ;
         A602MaqCod = P099G2_A602MaqCod[0] ;
         A2804RecLinMaq = P099G2_A2804RecLinMaq[0] ;
         if ( ( ( GXutil.strcmp(A602MaqCod, " ") == 0 ) ) || ( (GXutil.strcmp("", A602MaqCod)==0) ) )
         {
            /* Using cursor P099G3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8NumRecs = (short)(0) ;
      /* Using cursor P099G4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6039RecAcab = P099G4_A6039RecAcab[0] ;
         n6039RecAcab = P099G4_n6039RecAcab[0] ;
         A2804RecLinMaq = P099G4_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV9RecLinMaq = A2804RecLinMaq ;
            AV8NumRecs = (short)(AV8NumRecs+1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV8NumRecs = (short)(((AV8NumRecs==1)&&(AV9RecLinMaq!=10) ? 2 : AV8NumRecs)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp023.this.A396EmprCod;
      this.aP1[0] = pdyrp023.this.A129BarCod;
      this.aP2[0] = pdyrp023.this.A132BarCodReo;
      this.aP3[0] = pdyrp023.this.A130BarCodPar;
      this.aP4[0] = pdyrp023.this.AV8NumRecs;
      this.aP5[0] = pdyrp023.this.AV9RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp023");
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
      P099G2_A396EmprCod = new String[] {""} ;
      P099G2_A129BarCod = new int[1] ;
      P099G2_A132BarCodReo = new byte[1] ;
      P099G2_A130BarCodPar = new String[] {""} ;
      P099G2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099G2_A602MaqCod = new String[] {""} ;
      P099G2_A2804RecLinMaq = new short[1] ;
      A2806RecFA = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      P099G4_A396EmprCod = new String[] {""} ;
      P099G4_A129BarCod = new int[1] ;
      P099G4_A132BarCodReo = new byte[1] ;
      P099G4_A130BarCodPar = new String[] {""} ;
      P099G4_A6039RecAcab = new String[] {""} ;
      P099G4_n6039RecAcab = new boolean[] {false} ;
      P099G4_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp023__default(),
         new Object[] {
             new Object[] {
            P099G2_A396EmprCod, P099G2_A129BarCod, P099G2_A132BarCodReo, P099G2_A130BarCodPar, P099G2_A2806RecFA, P099G2_A602MaqCod, P099G2_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            P099G4_A396EmprCod, P099G4_A129BarCod, P099G4_A132BarCodReo, P099G4_A130BarCodPar, P099G4_A6039RecAcab, P099G4_n6039RecAcab, P099G4_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8NumRecs ;
   private short AV9RecLinMaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A2806RecFA ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private boolean n6039RecAcab ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P099G2_A396EmprCod ;
   private int[] P099G2_A129BarCod ;
   private byte[] P099G2_A132BarCodReo ;
   private String[] P099G2_A130BarCodPar ;
   private java.math.BigDecimal[] P099G2_A2806RecFA ;
   private String[] P099G2_A602MaqCod ;
   private short[] P099G2_A2804RecLinMaq ;
   private String[] P099G4_A396EmprCod ;
   private int[] P099G4_A129BarCod ;
   private byte[] P099G4_A132BarCodReo ;
   private String[] P099G4_A130BarCodPar ;
   private String[] P099G4_A6039RecAcab ;
   private boolean[] P099G4_n6039RecAcab ;
   private short[] P099G4_A2804RecLinMaq ;
}

final  class pdyrp023__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099G2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecFA, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P099G3", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P099G4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

