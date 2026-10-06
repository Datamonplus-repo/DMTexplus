package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prechdr extends GXProcedure
{
   public prechdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prechdr.class ), "" );
   }

   public prechdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      prechdr.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prechdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prechdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prechdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prechdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prechdr.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      prechdr.this.AV13FlagRec = aP5[0];
      this.aP5 = aP5;
      prechdr.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FlagRec = (byte)(0) ;
      Gx_msg = " " ;
      /* Using cursor P01D42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01D42_A457FasCod[0] ;
         A194BarOrdLin = P01D42_A194BarOrdLin[0] ;
         AV15Barordlin = A194BarOrdLin ;
         AV16FasCod = A457FasCod ;
         /* Using cursor P01D43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV15Barordlin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4268RecOrdLin = P01D43_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P01D43_n4268RecOrdLin[0] ;
            A2804RecLinMaq = P01D43_A2804RecLinMaq[0] ;
            AV13FlagRec = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13FlagRec == 1 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. Hay Recetas para la OP ", "") + GXutil.str( A129BarCod, 8, 0) + A130BarCodPar + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Orden-Fase = ", "") + GXutil.trim( GXutil.str( AV15Barordlin, 4, 0)) + "-" + GXutil.trim( AV16FasCod) + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prechdr.this.A396EmprCod;
      this.aP1[0] = prechdr.this.A129BarCod;
      this.aP2[0] = prechdr.this.A132BarCodReo;
      this.aP3[0] = prechdr.this.A130BarCodPar;
      this.aP4[0] = prechdr.this.A758ProCod;
      this.aP5[0] = prechdr.this.AV13FlagRec;
      this.aP6[0] = prechdr.this.Gx_msg;
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
      P01D42_A396EmprCod = new String[] {""} ;
      P01D42_A129BarCod = new int[1] ;
      P01D42_A132BarCodReo = new byte[1] ;
      P01D42_A130BarCodPar = new String[] {""} ;
      P01D42_A758ProCod = new String[] {""} ;
      P01D42_A457FasCod = new String[] {""} ;
      P01D42_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      AV16FasCod = "" ;
      P01D43_A396EmprCod = new String[] {""} ;
      P01D43_A129BarCod = new int[1] ;
      P01D43_A132BarCodReo = new byte[1] ;
      P01D43_A130BarCodPar = new String[] {""} ;
      P01D43_A4268RecOrdLin = new short[1] ;
      P01D43_n4268RecOrdLin = new boolean[] {false} ;
      P01D43_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prechdr__default(),
         new Object[] {
             new Object[] {
            P01D42_A396EmprCod, P01D42_A129BarCod, P01D42_A132BarCodReo, P01D42_A130BarCodPar, P01D42_A758ProCod, P01D42_A457FasCod, P01D42_A194BarOrdLin
            }
            , new Object[] {
            P01D43_A396EmprCod, P01D43_A129BarCod, P01D43_A132BarCodReo, P01D43_A130BarCodPar, P01D43_A4268RecOrdLin, P01D43_n4268RecOrdLin, P01D43_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13FlagRec ;
   private short A194BarOrdLin ;
   private short AV15Barordlin ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String AV16FasCod ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01D42_A396EmprCod ;
   private int[] P01D42_A129BarCod ;
   private byte[] P01D42_A132BarCodReo ;
   private String[] P01D42_A130BarCodPar ;
   private String[] P01D42_A758ProCod ;
   private String[] P01D42_A457FasCod ;
   private short[] P01D42_A194BarOrdLin ;
   private String[] P01D43_A396EmprCod ;
   private int[] P01D43_A129BarCod ;
   private byte[] P01D43_A132BarCodReo ;
   private String[] P01D43_A130BarCodPar ;
   private short[] P01D43_A4268RecOrdLin ;
   private boolean[] P01D43_n4268RecOrdLin ;
   private short[] P01D43_A2804RecLinMaq ;
}

final  class prechdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01D42", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01D43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecOrdLin, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

