package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcremag extends GXProcedure
{
   public pcremag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcremag.class ), "" );
   }

   public pcremag( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pcremag.this.aP3 = new String[] {""};
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
      pcremag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcremag.this.AV8MacBarCod = aP1[0];
      this.aP1 = aP1;
      pcremag.this.AV9MacBarReo = aP2[0];
      this.aP2 = aP2;
      pcremag.this.AV10MacBarPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV8MacBarCod, AV9MacBarReo, AV10MacBarPar) ;
      GXt_int1 = AV11BarOrdLin ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV8MacBarCod ;
      GXv_int4[0] = AV9MacBarReo ;
      GXv_char5[0] = AV10MacBarPar ;
      GXv_int6[0] = GXt_int1 ;
      new app.pfasmin(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
      pcremag.this.A396EmprCod = GXv_char2[0] ;
      pcremag.this.AV8MacBarCod = GXv_int3[0] ;
      pcremag.this.AV9MacBarReo = GXv_int4[0] ;
      pcremag.this.AV10MacBarPar = GXv_char5[0] ;
      pcremag.this.GXt_int1 = GXv_int6[0] ;
      AV11BarOrdLin = GXt_int1 ;
      if ( ! (0==AV11BarOrdLin) )
      {
         /* Using cursor P02J42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8MacBarCod), Byte.valueOf(AV9MacBarReo), AV10MacBarPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P02J42_A130BarCodPar[0] ;
            A132BarCodReo = P02J42_A132BarCodReo[0] ;
            A129BarCod = P02J42_A129BarCod[0] ;
            A122BarAgrPar = P02J42_A122BarAgrPar[0] ;
            A124BarAgrReo = P02J42_A124BarAgrReo[0] ;
            A119BarAgrCod = P02J42_A119BarAgrCod[0] ;
            GXt_int1 = AV12BarOrdLAgr ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int3[0] = A119BarAgrCod ;
            GXv_int4[0] = A124BarAgrReo ;
            GXv_char2[0] = A122BarAgrPar ;
            GXv_int6[0] = GXt_int1 ;
            new app.pfasmin(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_int6) ;
            pcremag.this.A396EmprCod = GXv_char5[0] ;
            pcremag.this.A119BarAgrCod = GXv_int3[0] ;
            pcremag.this.A124BarAgrReo = GXv_int4[0] ;
            pcremag.this.A122BarAgrPar = GXv_char2[0] ;
            pcremag.this.GXt_int1 = GXv_int6[0] ;
            AV12BarOrdLAgr = GXt_int1 ;
            if ( ! (0==AV12BarOrdLAgr) )
            {
               GXv_char5[0] = A396EmprCod ;
               GXv_int3[0] = AV8MacBarCod ;
               GXv_int4[0] = AV9MacBarReo ;
               GXv_char2[0] = AV10MacBarPar ;
               GXv_int6[0] = AV11BarOrdLin ;
               GXv_int7[0] = A119BarAgrCod ;
               GXv_int8[0] = A124BarAgrReo ;
               GXv_char9[0] = A122BarAgrPar ;
               GXv_int10[0] = AV12BarOrdLAgr ;
               new app.pnewagr(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_int6, GXv_int7, GXv_int8, GXv_char9, GXv_int10) ;
               pcremag.this.A396EmprCod = GXv_char5[0] ;
               pcremag.this.AV8MacBarCod = GXv_int3[0] ;
               pcremag.this.AV9MacBarReo = GXv_int4[0] ;
               pcremag.this.AV10MacBarPar = GXv_char2[0] ;
               pcremag.this.AV11BarOrdLin = GXv_int6[0] ;
               pcremag.this.A119BarAgrCod = GXv_int7[0] ;
               pcremag.this.A124BarAgrReo = GXv_int8[0] ;
               pcremag.this.A122BarAgrPar = GXv_char9[0] ;
               pcremag.this.AV12BarOrdLAgr = GXv_int10[0] ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcremag.this.A396EmprCod;
      this.aP1[0] = pcremag.this.AV8MacBarCod;
      this.aP2[0] = pcremag.this.AV9MacBarReo;
      this.aP3[0] = pcremag.this.AV10MacBarPar;
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
      P02J42_A396EmprCod = new String[] {""} ;
      P02J42_A130BarCodPar = new String[] {""} ;
      P02J42_A132BarCodReo = new byte[1] ;
      P02J42_A129BarCod = new int[1] ;
      P02J42_A122BarAgrPar = new String[] {""} ;
      P02J42_A124BarAgrReo = new byte[1] ;
      P02J42_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcremag__default(),
         new Object[] {
             new Object[] {
            P02J42_A396EmprCod, P02J42_A130BarCodPar, P02J42_A132BarCodReo, P02J42_A129BarCod, P02J42_A122BarAgrPar, P02J42_A124BarAgrReo, P02J42_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9MacBarReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int4[] ;
   private byte GXv_int8[] ;
   private short AV11BarOrdLin ;
   private short AV12BarOrdLAgr ;
   private short GXt_int1 ;
   private short GXv_int6[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV8MacBarCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int3[] ;
   private int GXv_int7[] ;
   private String A396EmprCod ;
   private String AV10MacBarPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02J42_A396EmprCod ;
   private String[] P02J42_A130BarCodPar ;
   private byte[] P02J42_A132BarCodReo ;
   private int[] P02J42_A129BarCod ;
   private String[] P02J42_A122BarAgrPar ;
   private byte[] P02J42_A124BarAgrReo ;
   private int[] P02J42_A119BarAgrCod ;
}

final  class pcremag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02J42", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

