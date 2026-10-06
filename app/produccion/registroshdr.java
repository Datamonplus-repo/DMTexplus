package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registroshdr extends GXProcedure
{
   public registroshdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroshdr.class ), "" );
   }

   public registroshdr( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           byte aP1 ,
                           String aP2 ,
                           String aP3 ,
                           java.util.Date aP4 ,
                           java.util.Date aP5 )
   {
      registroshdr.this.aP6 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        long[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             long[] aP6 )
   {
      registroshdr.this.AV13EmprCod = aP0;
      registroshdr.this.AV16HisEstReo = aP1;
      registroshdr.this.AV11MaqCod1 = aP2;
      registroshdr.this.AV12MaqCod2 = aP3;
      registroshdr.this.AV20Hisprofec1 = aP4;
      registroshdr.this.AV21Hisprofec2 = aP5;
      registroshdr.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24CantidadRegistros = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV16HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A4441HisProDTF ,
                                           AV20Hisprofec1 ,
                                           AV21Hisprofec2 ,
                                           AV13EmprCod ,
                                           AV11MaqCod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV12MaqCod2 } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A282 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV11MaqCod1, AV20Hisprofec1, AV21Hisprofec2, AV12MaqCod2, Byte.valueOf(AV16HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3612HisProReo = P0A282_A3612HisProReo[0] ;
         A4441HisProDTF = P0A282_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A282_n4441HisProDTF[0] ;
         A602MaqCod = P0A282_A602MaqCod[0] ;
         A396EmprCod = P0A282_A396EmprCod[0] ;
         A461Fase = P0A282_A461Fase[0] ;
         A561HisProLin = P0A282_A561HisProLin[0] ;
         A558HisProFec = P0A282_A558HisProFec[0] ;
         AV27fase = A461Fase ;
         /* Execute user subroutine: 'FASPRO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV24CantidadRegistros = (long)(AV24CantidadRegistros+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV26FasDivTime = httpContext.getMessage( "N", "") ;
      /* Using cursor P0A283 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV27fase});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P0A283_A457FasCod[0] ;
         A396EmprCod = P0A283_A396EmprCod[0] ;
         A14054FasDivTime = P0A283_A14054FasDivTime[0] ;
         AV26FasDivTime = A14054FasDivTime ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP6[0] = registroshdr.this.AV24CantidadRegistros;
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
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P0A282_A3612HisProReo = new byte[1] ;
      P0A282_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A282_n4441HisProDTF = new boolean[] {false} ;
      P0A282_A602MaqCod = new String[] {""} ;
      P0A282_A396EmprCod = new String[] {""} ;
      P0A282_A461Fase = new String[] {""} ;
      P0A282_A561HisProLin = new int[1] ;
      P0A282_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A461Fase = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV27fase = "" ;
      AV26FasDivTime = "" ;
      P0A283_A457FasCod = new String[] {""} ;
      P0A283_A396EmprCod = new String[] {""} ;
      P0A283_A14054FasDivTime = new String[] {""} ;
      A457FasCod = "" ;
      A14054FasDivTime = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.registroshdr__default(),
         new Object[] {
             new Object[] {
            P0A282_A3612HisProReo, P0A282_A4441HisProDTF, P0A282_n4441HisProDTF, P0A282_A602MaqCod, P0A282_A396EmprCod, P0A282_A461Fase, P0A282_A561HisProLin, P0A282_A558HisProFec
            }
            , new Object[] {
            P0A283_A457FasCod, P0A283_A396EmprCod, P0A283_A14054FasDivTime
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16HisEstReo ;
   private byte A3612HisProReo ;
   private short Gx_err ;
   private int A561HisProLin ;
   private long AV24CantidadRegistros ;
   private String AV13EmprCod ;
   private String AV11MaqCod1 ;
   private String AV12MaqCod2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String AV27fase ;
   private String AV26FasDivTime ;
   private String A457FasCod ;
   private String A14054FasDivTime ;
   private java.util.Date AV20Hisprofec1 ;
   private java.util.Date AV21Hisprofec2 ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n4441HisProDTF ;
   private boolean returnInSub ;
   private long[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A282_A3612HisProReo ;
   private java.util.Date[] P0A282_A4441HisProDTF ;
   private boolean[] P0A282_n4441HisProDTF ;
   private String[] P0A282_A602MaqCod ;
   private String[] P0A282_A396EmprCod ;
   private String[] P0A282_A461Fase ;
   private int[] P0A282_A561HisProLin ;
   private java.util.Date[] P0A282_A558HisProFec ;
   private String[] P0A283_A457FasCod ;
   private String[] P0A283_A396EmprCod ;
   private String[] P0A283_A14054FasDivTime ;
}

final  class registroshdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A282( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV16HisEstReo ,
                                          byte A3612HisProReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV20Hisprofec1 ,
                                          java.util.Date AV21Hisprofec2 ,
                                          String AV13EmprCod ,
                                          String AV11MaqCod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV12MaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT HisProReo, HisProDTF, MaqCod, EmprCod, Fase, HisProLin, HisProFec FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod >= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      if ( ! ( AV16HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod, HisProFec, HisProLin" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A282(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A282", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A283", "SELECT FasCod, EmprCod, FasDivTime FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

