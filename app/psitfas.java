package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitfas extends GXProcedure
{
   public psitfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitfas.class ), "" );
   }

   public psitfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 )
   {
      psitfas.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      psitfas.this.A396EmprCod = aP0;
      psitfas.this.A129BarCod = aP1;
      psitfas.this.A132BarCodReo = aP2;
      psitfas.this.A130BarCodPar = aP3;
      psitfas.this.A194BarOrdLin = aP4;
      psitfas.this.aP5 = aP5;
      psitfas.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EstFase = GXutil.space( (short)(1)) ;
      /* Using cursor P01832 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P01832_A153BarFasEst[0] ;
         A12360BarFasTOb = P01832_A12360BarFasTOb[0] ;
         n12360BarFasTOb = P01832_n12360BarFasTOb[0] ;
         A758ProCod = P01832_A758ProCod[0] ;
         if ( A153BarFasEst == 1 )
         {
            AV8EstFase = httpContext.getMessage( "I", "") ;
         }
         if ( A153BarFasEst == 2 )
         {
            AV8EstFase = httpContext.getMessage( "F", "") ;
            AV9Terminus = A12360BarFasTOb ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = psitfas.this.AV8EstFase;
      this.aP6[0] = psitfas.this.AV9Terminus;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8EstFase = "" ;
      AV9Terminus = "" ;
      scmdbuf = "" ;
      P01832_A396EmprCod = new String[] {""} ;
      P01832_A129BarCod = new int[1] ;
      P01832_A132BarCodReo = new byte[1] ;
      P01832_A130BarCodPar = new String[] {""} ;
      P01832_A194BarOrdLin = new short[1] ;
      P01832_A153BarFasEst = new byte[1] ;
      P01832_A12360BarFasTOb = new String[] {""} ;
      P01832_n12360BarFasTOb = new boolean[] {false} ;
      P01832_A758ProCod = new String[] {""} ;
      A12360BarFasTOb = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitfas__default(),
         new Object[] {
             new Object[] {
            P01832_A396EmprCod, P01832_A129BarCod, P01832_A132BarCodReo, P01832_A130BarCodPar, P01832_A194BarOrdLin, P01832_A153BarFasEst, P01832_A12360BarFasTOb, P01832_n12360BarFasTOb, P01832_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8EstFase ;
   private String AV9Terminus ;
   private String scmdbuf ;
   private String A12360BarFasTOb ;
   private String A758ProCod ;
   private boolean n12360BarFasTOb ;
   private String[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01832_A396EmprCod ;
   private int[] P01832_A129BarCod ;
   private byte[] P01832_A132BarCodReo ;
   private String[] P01832_A130BarCodPar ;
   private short[] P01832_A194BarOrdLin ;
   private byte[] P01832_A153BarFasEst ;
   private String[] P01832_A12360BarFasTOb ;
   private boolean[] P01832_n12360BarFasTOb ;
   private String[] P01832_A758ProCod ;
}

final  class psitfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01832", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, BarFasTOb, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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
      }
   }

}

