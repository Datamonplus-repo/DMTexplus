package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pforcon extends GXProcedure
{
   public pforcon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pforcon.class ), "" );
   }

   public pforcon( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      pforcon.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pforcon.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pforcon.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pforcon.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pforcon.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pforcon.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pforcon.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pforcon.this.AV8ForCon = aP6[0];
      this.aP6 = aP6;
      pforcon.this.AV9F_okcolor = aP7[0];
      this.aP7 = aP7;
      pforcon.this.AV10INTDSCF = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9F_okcolor = (byte)(0) ;
      AV10INTDSCF = "" ;
      AV14ForColNom = A482ForColNom ;
      /* Using cursor P01M42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5362IntCodF = P01M42_A5362IntCodF[0] ;
         n5362IntCodF = P01M42_n5362IntCodF[0] ;
         A484ForCon = P01M42_A484ForCon[0] ;
         A5363IntDscF = P01M42_A5363IntDscF[0] ;
         n5363IntDscF = P01M42_n5363IntDscF[0] ;
         A5363IntDscF = P01M42_A5363IntDscF[0] ;
         n5363IntDscF = P01M42_n5363IntDscF[0] ;
         AV8ForCon = A484ForCon ;
         AV11i = (byte)(1) ;
         while ( AV11i <= 30 )
         {
            AV12VCar = GXutil.substring( A5363IntDscF, AV11i, 1) ;
            if ( GXutil.strcmp(AV12VCar, "-") == 0 )
            {
               AV13Pos_v = AV11i ;
               if (true) break;
            }
            AV11i = (byte)(AV11i+1) ;
         }
         AV13Pos_v = (byte)(AV13Pos_v-1) ;
         AV10INTDSCF = GXutil.substring( A5363IntDscF, 1, AV13Pos_v) ;
         AV9F_okcolor = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( (GXutil.strcmp("", AV14ForColNom)==0) )
      {
         AV10INTDSCF = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pforcon.this.A396EmprCod;
      this.aP1[0] = pforcon.this.A252CliCod;
      this.aP2[0] = pforcon.this.A494ForSer;
      this.aP3[0] = pforcon.this.A482ForColNom;
      this.aP4[0] = pforcon.this.A483ForColNum;
      this.aP5[0] = pforcon.this.A831TipColCod;
      this.aP6[0] = pforcon.this.AV8ForCon;
      this.aP7[0] = pforcon.this.AV9F_okcolor;
      this.aP8[0] = pforcon.this.AV10INTDSCF;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14ForColNom = "" ;
      scmdbuf = "" ;
      P01M42_A5362IntCodF = new byte[1] ;
      P01M42_n5362IntCodF = new boolean[] {false} ;
      P01M42_A396EmprCod = new String[] {""} ;
      P01M42_A252CliCod = new int[1] ;
      P01M42_A494ForSer = new String[] {""} ;
      P01M42_A482ForColNom = new String[] {""} ;
      P01M42_A483ForColNum = new int[1] ;
      P01M42_A831TipColCod = new byte[1] ;
      P01M42_A484ForCon = new byte[1] ;
      P01M42_A5363IntDscF = new String[] {""} ;
      P01M42_n5363IntDscF = new boolean[] {false} ;
      A5363IntDscF = "" ;
      AV12VCar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pforcon__default(),
         new Object[] {
             new Object[] {
            P01M42_A5362IntCodF, P01M42_n5362IntCodF, P01M42_A396EmprCod, P01M42_A252CliCod, P01M42_A494ForSer, P01M42_A482ForColNom, P01M42_A483ForColNum, P01M42_A831TipColCod, P01M42_A484ForCon, P01M42_A5363IntDscF,
            P01M42_n5363IntDscF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8ForCon ;
   private byte AV9F_okcolor ;
   private byte A5362IntCodF ;
   private byte A484ForCon ;
   private byte AV11i ;
   private byte AV13Pos_v ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV10INTDSCF ;
   private String AV14ForColNom ;
   private String scmdbuf ;
   private String A5363IntDscF ;
   private String AV12VCar ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01M42_A5362IntCodF ;
   private boolean[] P01M42_n5362IntCodF ;
   private String[] P01M42_A396EmprCod ;
   private int[] P01M42_A252CliCod ;
   private String[] P01M42_A494ForSer ;
   private String[] P01M42_A482ForColNom ;
   private int[] P01M42_A483ForColNum ;
   private byte[] P01M42_A831TipColCod ;
   private byte[] P01M42_A484ForCon ;
   private String[] P01M42_A5363IntDscF ;
   private boolean[] P01M42_n5363IntDscF ;
}

final  class pforcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01M42", "SELECT T1.IntCodF, T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForCon, T2.IntDscF FROM (TXPCFORMU T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

