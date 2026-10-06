package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinprf extends GXProcedure
{
   public plinprf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinprf.class ), "" );
   }

   public plinprf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            short[] aP5 )
   {
      plinprf.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      plinprf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plinprf.this.A2792TermiCod = aP1[0];
      this.aP1 = aP1;
      plinprf.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      plinprf.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      plinprf.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      plinprf.this.A2794BarLinMaq = aP5[0];
      this.aP5 = aP5;
      plinprf.this.AV9BarPrfLin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00RP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2800BarPrfULi2 = P00RP2_A2800BarPrfULi2[0] ;
         n2800BarPrfULi2 = P00RP2_n2800BarPrfULi2[0] ;
         AV8BarPrfUli2 = A2800BarPrfULi2 ;
         A2800BarPrfULi2 = (short)(A2800BarPrfULi2+10) ;
         n2800BarPrfULi2 = false ;
         /* Using cursor P00RP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(A2800BarPrfULi2), A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV9BarPrfLin = (short)(AV8BarPrfUli2+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinprf.this.A396EmprCod;
      this.aP1[0] = plinprf.this.A2792TermiCod;
      this.aP2[0] = plinprf.this.A129BarCod;
      this.aP3[0] = plinprf.this.A132BarCodReo;
      this.aP4[0] = plinprf.this.A130BarCodPar;
      this.aP5[0] = plinprf.this.A2794BarLinMaq;
      this.aP6[0] = plinprf.this.AV9BarPrfLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "plinprf");
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
      P00RP2_A396EmprCod = new String[] {""} ;
      P00RP2_A2792TermiCod = new String[] {""} ;
      P00RP2_A129BarCod = new int[1] ;
      P00RP2_A132BarCodReo = new byte[1] ;
      P00RP2_A130BarCodPar = new String[] {""} ;
      P00RP2_A2794BarLinMaq = new short[1] ;
      P00RP2_A2800BarPrfULi2 = new short[1] ;
      P00RP2_n2800BarPrfULi2 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinprf__default(),
         new Object[] {
             new Object[] {
            P00RP2_A396EmprCod, P00RP2_A2792TermiCod, P00RP2_A129BarCod, P00RP2_A132BarCodReo, P00RP2_A130BarCodPar, P00RP2_A2794BarLinMaq, P00RP2_A2800BarPrfULi2, P00RP2_n2800BarPrfULi2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2794BarLinMaq ;
   private short AV9BarPrfLin ;
   private short A2800BarPrfULi2 ;
   private short AV8BarPrfUli2 ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n2800BarPrfULi2 ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00RP2_A396EmprCod ;
   private String[] P00RP2_A2792TermiCod ;
   private int[] P00RP2_A129BarCod ;
   private byte[] P00RP2_A132BarCodReo ;
   private String[] P00RP2_A130BarCodPar ;
   private short[] P00RP2_A2794BarLinMaq ;
   private short[] P00RP2_A2800BarPrfULi2 ;
   private boolean[] P00RP2_n2800BarPrfULi2 ;
}

final  class plinprf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00RP2", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfULi2 FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00RP3", "UPDATE TXPBARMAQ SET BarPrfULi2=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

