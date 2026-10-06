package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnothdrs extends GXProcedure
{
   public pnothdrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnothdrs.class ), "" );
   }

   public pnothdrs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               int[] aP1 ,
                               byte[] aP2 ,
                               String[] aP3 )
   {
      AV8Tab_notas = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV8Tab_notas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, aP3, AV8Tab_notas);
      return AV8Tab_notas;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] AV8Tab_notas )
   {
      execute_int(aP0, aP1, aP2, aP3, AV8Tab_notas);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV8Tab_notas )
   {
      pnothdrs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnothdrs.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnothdrs.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnothdrs.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnothdrs.this.AV8Tab_notas = AV8Tab_notas;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV8Tab_notas[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9Linea = (byte)(1) ;
      /* Using cursor P03KK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A187BarNotDsc = P03KK2_A187BarNotDsc[0] ;
         A188BarNotLin = P03KK2_A188BarNotLin[0] ;
         AV8Tab_notas[AV9Linea-1] = A187BarNotDsc ;
         AV9Linea = (byte)(AV9Linea+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnothdrs.this.A396EmprCod;
      this.aP1[0] = pnothdrs.this.A129BarCod;
      this.aP2[0] = pnothdrs.this.A132BarCodReo;
      this.aP3[0] = pnothdrs.this.A130BarCodPar;
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
      P03KK2_A396EmprCod = new String[] {""} ;
      P03KK2_A129BarCod = new int[1] ;
      P03KK2_A132BarCodReo = new byte[1] ;
      P03KK2_A130BarCodPar = new String[] {""} ;
      P03KK2_A187BarNotDsc = new String[] {""} ;
      P03KK2_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnothdrs__default(),
         new Object[] {
             new Object[] {
            P03KK2_A396EmprCod, P03KK2_A129BarCod, P03KK2_A132BarCodReo, P03KK2_A130BarCodPar, P03KK2_A187BarNotDsc, P03KK2_A188BarNotLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Linea ;
   private byte A188BarNotLin ;
   private short Gx_err ;
   private int GX_I ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A187BarNotDsc ;
   private String[] AV8Tab_notas ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KK2_A396EmprCod ;
   private int[] P03KK2_A129BarCod ;
   private byte[] P03KK2_A132BarCodReo ;
   private String[] P03KK2_A130BarCodPar ;
   private String[] P03KK2_A187BarNotDsc ;
   private byte[] P03KK2_A188BarNotLin ;
}

final  class pnothdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KK2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
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
               return;
      }
   }

}

