package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamqf extends GXProcedure
{
   public pclamqf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamqf.class ), "" );
   }

   public pclamqf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pclamqf.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pclamqf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamqf.this.AV11Descrip = aP1[0];
      this.aP1 = aP1;
      pclamqf.this.AV12Clave = aP2[0];
      this.aP2 = aP2;
      pclamqf.this.AV27PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamqf.this.AV13BarCod = aP4[0];
      this.aP4 = aP4;
      pclamqf.this.AV14BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamqf.this.AV15BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamqf.this.AV21BarLinMaq = aP7[0];
      this.aP7 = aP7;
      pclamqf.this.AV16Accion = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27PrdVal = (byte)(0) ;
      AV25FMaq = (byte)(0) ;
      AV26FCod = (byte)(0) ;
      AV17CodMaq = GXutil.rtrim( GXutil.substring( AV12Clave, 5, 6)) ;
      AV23FasCod = GXutil.trim( GXutil.substring( AV12Clave, 12, 8)) ;
      AV16Accion = GXutil.substring( AV12Clave, 21, 1) ;
      /* Using cursor P02IP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, Short.valueOf(AV21BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02IP2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02IP2_A130BarCodPar[0] ;
         A132BarCodReo = P02IP2_A132BarCodReo[0] ;
         A129BarCod = P02IP2_A129BarCod[0] ;
         A602MaqCod = P02IP2_A602MaqCod[0] ;
         if ( GXutil.like( A602MaqCod , GXutil.padr( AV17CodMaq , 6 , "%"),  ' ' ) )
         {
            AV25FMaq = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02IP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, AV23FasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P02IP3_A457FasCod[0] ;
         A130BarCodPar = P02IP3_A130BarCodPar[0] ;
         A132BarCodReo = P02IP3_A132BarCodReo[0] ;
         A129BarCod = P02IP3_A129BarCod[0] ;
         A194BarOrdLin = P02IP3_A194BarOrdLin[0] ;
         A758ProCod = P02IP3_A758ProCod[0] ;
         AV26FCod = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( ( AV25FMaq == 1 ) && ( AV26FCod == 1 ) )
      {
         AV27PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamqf.this.A396EmprCod;
      this.aP1[0] = pclamqf.this.AV11Descrip;
      this.aP2[0] = pclamqf.this.AV12Clave;
      this.aP3[0] = pclamqf.this.AV27PrdVal;
      this.aP4[0] = pclamqf.this.AV13BarCod;
      this.aP5[0] = pclamqf.this.AV14BarCodReo;
      this.aP6[0] = pclamqf.this.AV15BarCodPar;
      this.aP7[0] = pclamqf.this.AV21BarLinMaq;
      this.aP8[0] = pclamqf.this.AV16Accion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17CodMaq = "" ;
      AV23FasCod = "" ;
      scmdbuf = "" ;
      P02IP2_A396EmprCod = new String[] {""} ;
      P02IP2_A2804RecLinMaq = new short[1] ;
      P02IP2_A130BarCodPar = new String[] {""} ;
      P02IP2_A132BarCodReo = new byte[1] ;
      P02IP2_A129BarCod = new int[1] ;
      P02IP2_A602MaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      P02IP3_A396EmprCod = new String[] {""} ;
      P02IP3_A457FasCod = new String[] {""} ;
      P02IP3_A130BarCodPar = new String[] {""} ;
      P02IP3_A132BarCodReo = new byte[1] ;
      P02IP3_A129BarCod = new int[1] ;
      P02IP3_A194BarOrdLin = new short[1] ;
      P02IP3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamqf__default(),
         new Object[] {
             new Object[] {
            P02IP2_A396EmprCod, P02IP2_A2804RecLinMaq, P02IP2_A130BarCodPar, P02IP2_A132BarCodReo, P02IP2_A129BarCod, P02IP2_A602MaqCod
            }
            , new Object[] {
            P02IP3_A396EmprCod, P02IP3_A457FasCod, P02IP3_A130BarCodPar, P02IP3_A132BarCodReo, P02IP3_A129BarCod, P02IP3_A194BarOrdLin, P02IP3_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27PrdVal ;
   private byte AV14BarCodReo ;
   private byte AV25FMaq ;
   private byte AV26FCod ;
   private byte A132BarCodReo ;
   private short AV21BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Descrip ;
   private String AV12Clave ;
   private String AV15BarCodPar ;
   private String AV16Accion ;
   private String AV17CodMaq ;
   private String AV23FasCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IP2_A396EmprCod ;
   private short[] P02IP2_A2804RecLinMaq ;
   private String[] P02IP2_A130BarCodPar ;
   private byte[] P02IP2_A132BarCodReo ;
   private int[] P02IP2_A129BarCod ;
   private String[] P02IP2_A602MaqCod ;
   private String[] P02IP3_A396EmprCod ;
   private String[] P02IP3_A457FasCod ;
   private String[] P02IP3_A130BarCodPar ;
   private byte[] P02IP3_A132BarCodReo ;
   private int[] P02IP3_A129BarCod ;
   private short[] P02IP3_A194BarOrdLin ;
   private String[] P02IP3_A758ProCod ;
}

final  class pclamqf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IP2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02IP3", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

