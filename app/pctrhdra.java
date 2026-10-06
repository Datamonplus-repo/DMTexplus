package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrhdra extends GXProcedure
{
   public pctrhdra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrhdra.class ), "" );
   }

   public pctrhdra( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pctrhdra.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pctrhdra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrhdra.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pctrhdra.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrhdra.this.AV9BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrhdra.this.AV11HayAgr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11HayAgr = (byte)(0) ;
      /* Using cursor P028N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P028N2_A130BarCodPar[0] ;
         A132BarCodReo = P028N2_A132BarCodReo[0] ;
         A129BarCod = P028N2_A129BarCod[0] ;
         A122BarAgrPar = P028N2_A122BarAgrPar[0] ;
         A124BarAgrReo = P028N2_A124BarAgrReo[0] ;
         A119BarAgrCod = P028N2_A119BarAgrCod[0] ;
         AV11HayAgr = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11HayAgr == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P028N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A119BarAgrCod = P028N3_A119BarAgrCod[0] ;
         A124BarAgrReo = P028N3_A124BarAgrReo[0] ;
         A122BarAgrPar = P028N3_A122BarAgrPar[0] ;
         A129BarCod = P028N3_A129BarCod[0] ;
         A132BarCodReo = P028N3_A132BarCodReo[0] ;
         A130BarCodPar = P028N3_A130BarCodPar[0] ;
         AV11HayAgr = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV11HayAgr == 1 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrhdra.this.A396EmprCod;
      this.aP1[0] = pctrhdra.this.AV8BarCod;
      this.aP2[0] = pctrhdra.this.AV10BarCodReo;
      this.aP3[0] = pctrhdra.this.AV9BarCodPar;
      this.aP4[0] = pctrhdra.this.AV11HayAgr;
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
      P028N2_A396EmprCod = new String[] {""} ;
      P028N2_A130BarCodPar = new String[] {""} ;
      P028N2_A132BarCodReo = new byte[1] ;
      P028N2_A129BarCod = new int[1] ;
      P028N2_A122BarAgrPar = new String[] {""} ;
      P028N2_A124BarAgrReo = new byte[1] ;
      P028N2_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      P028N3_A396EmprCod = new String[] {""} ;
      P028N3_A119BarAgrCod = new int[1] ;
      P028N3_A124BarAgrReo = new byte[1] ;
      P028N3_A122BarAgrPar = new String[] {""} ;
      P028N3_A129BarCod = new int[1] ;
      P028N3_A132BarCodReo = new byte[1] ;
      P028N3_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrhdra__default(),
         new Object[] {
             new Object[] {
            P028N2_A396EmprCod, P028N2_A130BarCodPar, P028N2_A132BarCodReo, P028N2_A129BarCod, P028N2_A122BarAgrPar, P028N2_A124BarAgrReo, P028N2_A119BarAgrCod
            }
            , new Object[] {
            P028N3_A396EmprCod, P028N3_A119BarAgrCod, P028N3_A124BarAgrReo, P028N3_A122BarAgrPar, P028N3_A129BarCod, P028N3_A132BarCodReo, P028N3_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV11HayAgr ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private String A396EmprCod ;
   private String AV9BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P028N2_A396EmprCod ;
   private String[] P028N2_A130BarCodPar ;
   private byte[] P028N2_A132BarCodReo ;
   private int[] P028N2_A129BarCod ;
   private String[] P028N2_A122BarAgrPar ;
   private byte[] P028N2_A124BarAgrReo ;
   private int[] P028N2_A119BarAgrCod ;
   private String[] P028N3_A396EmprCod ;
   private int[] P028N3_A119BarAgrCod ;
   private byte[] P028N3_A124BarAgrReo ;
   private String[] P028N3_A122BarAgrPar ;
   private int[] P028N3_A129BarCod ;
   private byte[] P028N3_A132BarCodReo ;
   private String[] P028N3_A130BarCodPar ;
}

final  class pctrhdra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028N2", "SELECT * FROM (SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028N3", "SELECT * FROM (SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarAgrCod, BarAgrReo, BarAgrPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
      }
   }

}

