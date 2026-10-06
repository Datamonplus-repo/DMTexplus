package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenrfa extends GXProcedure
{
   public prenrfa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenrfa.class ), "" );
   }

   public prenrfa( int remoteHandle ,
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
      prenrfa.this.aP4 = new short[] {0};
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
      prenrfa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prenrfa.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prenrfa.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenrfa.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenrfa.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagProc = (byte)(0) ;
      AV9RecLinPro = (byte)(0) ;
      AV11FlagInicio = (byte)(0) ;
      AV12LastNro = (byte)(0) ;
      /* Using cursor P01BS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2394RecForNro = P01BS2_A2394RecForNro[0] ;
         A811RecLin = P01BS2_A811RecLin[0] ;
         A1273RecLinPro = P01BS2_A1273RecLinPro[0] ;
         if ( A2394RecForNro > 0 )
         {
            if ( ( A1273RecLinPro != AV9RecLinPro ) && ( AV9RecLinPro > 0 ) )
            {
               AV12LastNro = (byte)(AV12LastNro+1) ;
               AV13LastNro2 = A2394RecForNro ;
               A2394RecForNro = AV12LastNro ;
            }
            else
            {
               if ( A2394RecForNro == AV13LastNro2 )
               {
                  A2394RecForNro = AV12LastNro ;
               }
               else
               {
                  AV12LastNro = (byte)(AV12LastNro+1) ;
                  AV13LastNro2 = A2394RecForNro ;
                  A2394RecForNro = AV12LastNro ;
               }
            }
            AV9RecLinPro = A1273RecLinPro ;
         }
         /* Using cursor P01BS3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A2394RecForNro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenrfa.this.A396EmprCod;
      this.aP1[0] = prenrfa.this.A129BarCod;
      this.aP2[0] = prenrfa.this.A132BarCodReo;
      this.aP3[0] = prenrfa.this.A130BarCodPar;
      this.aP4[0] = prenrfa.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenrfa");
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
      P01BS2_A396EmprCod = new String[] {""} ;
      P01BS2_A129BarCod = new int[1] ;
      P01BS2_A132BarCodReo = new byte[1] ;
      P01BS2_A130BarCodPar = new String[] {""} ;
      P01BS2_A2804RecLinMaq = new short[1] ;
      P01BS2_A2394RecForNro = new byte[1] ;
      P01BS2_A811RecLin = new short[1] ;
      P01BS2_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenrfa__default(),
         new Object[] {
             new Object[] {
            P01BS2_A396EmprCod, P01BS2_A129BarCod, P01BS2_A132BarCodReo, P01BS2_A130BarCodPar, P01BS2_A2804RecLinMaq, P01BS2_A2394RecForNro, P01BS2_A811RecLin, P01BS2_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8FlagProc ;
   private byte AV9RecLinPro ;
   private byte AV11FlagInicio ;
   private byte AV12LastNro ;
   private byte A2394RecForNro ;
   private byte A1273RecLinPro ;
   private byte AV13LastNro2 ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BS2_A396EmprCod ;
   private int[] P01BS2_A129BarCod ;
   private byte[] P01BS2_A132BarCodReo ;
   private String[] P01BS2_A130BarCodPar ;
   private short[] P01BS2_A2804RecLinMaq ;
   private byte[] P01BS2_A2394RecForNro ;
   private short[] P01BS2_A811RecLin ;
   private byte[] P01BS2_A1273RecLinPro ;
}

final  class prenrfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecForNro, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01BS3", "UPDATE TXPLRECET SET RecForNro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

