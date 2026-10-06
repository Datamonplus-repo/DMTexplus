package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datotcformu extends GXProcedure
{
   public datotcformu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datotcformu.class ), "" );
   }

   public datotcformu( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              String aP2 ,
                              String aP3 ,
                              int[] aP4 ,
                              byte[] aP5 ,
                              int[] aP6 ,
                              String[] aP7 ,
                              String[] aP8 )
   {
      datotcformu.this.aP9 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        boolean[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             boolean[] aP9 )
   {
      datotcformu.this.AV62EmprCod = aP0;
      datotcformu.this.AV8CliCod = aP1;
      datotcformu.this.AV9ForSer = aP2;
      datotcformu.this.AV10ForColNom = aP3;
      datotcformu.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      datotcformu.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      datotcformu.this.aP6 = aP6;
      datotcformu.this.aP7 = aP7;
      datotcformu.this.aP8 = aP8;
      datotcformu.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV74Encontrado = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV11ForColNum) ,
                                           Byte.valueOf(AV12TipColCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           AV62EmprCod ,
                                           Integer.valueOf(AV8CliCod) ,
                                           AV9ForSer ,
                                           AV10ForColNom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P086Z2 */
      pr_default.execute(0, new Object[] {AV62EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P086Z2_A831TipColCod[0] ;
         A1192ForNumCli = P086Z2_A1192ForNumCli[0] ;
         n1192ForNumCli = P086Z2_n1192ForNumCli[0] ;
         A483ForColNum = P086Z2_A483ForColNum[0] ;
         A1191ForNomCli = P086Z2_A1191ForNomCli[0] ;
         n1191ForNomCli = P086Z2_n1191ForNomCli[0] ;
         A482ForColNom = P086Z2_A482ForColNom[0] ;
         A494ForSer = P086Z2_A494ForSer[0] ;
         A252CliCod = P086Z2_A252CliCod[0] ;
         A396EmprCod = P086Z2_A396EmprCod[0] ;
         if ( (0==AV11ForColNum) )
         {
            AV11ForColNum = A483ForColNum ;
         }
         if ( (0==AV12TipColCod) )
         {
            AV12TipColCod = A831TipColCod ;
         }
         AV65ForNumcli = A1192ForNumCli ;
         AV64ForNomcli = A1191ForNomCli ;
         AV74Encontrado = true ;
         GXt_char1 = AV73ForTonal ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A494ForSer ;
         GXv_char5[0] = A482ForColNom ;
         GXv_int6[0] = A483ForColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_char8[0] = GXt_char1 ;
         new app.pcolcl5(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_char8) ;
         datotcformu.this.A396EmprCod = GXv_char2[0] ;
         datotcformu.this.A252CliCod = GXv_int3[0] ;
         datotcformu.this.A494ForSer = GXv_char4[0] ;
         datotcformu.this.A482ForColNom = GXv_char5[0] ;
         datotcformu.this.A483ForColNum = GXv_int6[0] ;
         datotcformu.this.A831TipColCod = GXv_int7[0] ;
         datotcformu.this.GXt_char1 = GXv_char8[0] ;
         AV73ForTonal = GXt_char1 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ! AV74Encontrado )
      {
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV11ForColNum) ,
                                              Byte.valueOf(AV12TipColCod) ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              AV62EmprCod ,
                                              Integer.valueOf(AV8CliCod) ,
                                              AV9ForSer ,
                                              AV10ForColNom ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor P086Z3 */
         pr_default.execute(1, new Object[] {AV62EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P086Z3_A831TipColCod[0] ;
            A483ForColNum = P086Z3_A483ForColNum[0] ;
            A482ForColNom = P086Z3_A482ForColNom[0] ;
            A494ForSer = P086Z3_A494ForSer[0] ;
            A252CliCod = P086Z3_A252CliCod[0] ;
            A396EmprCod = P086Z3_A396EmprCod[0] ;
            A1192ForNumCli = P086Z3_A1192ForNumCli[0] ;
            n1192ForNumCli = P086Z3_n1192ForNumCli[0] ;
            A1191ForNomCli = P086Z3_A1191ForNomCli[0] ;
            n1191ForNomCli = P086Z3_n1191ForNomCli[0] ;
            if ( (0==AV11ForColNum) )
            {
               AV11ForColNum = A483ForColNum ;
            }
            if ( (0==AV12TipColCod) )
            {
               AV12TipColCod = A831TipColCod ;
            }
            AV65ForNumcli = A1192ForNumCli ;
            AV64ForNomcli = A1191ForNomCli ;
            AV74Encontrado = true ;
            GXt_char1 = AV73ForTonal ;
            GXv_char8[0] = A396EmprCod ;
            GXv_int6[0] = A252CliCod ;
            GXv_char5[0] = A494ForSer ;
            GXv_char4[0] = A482ForColNom ;
            GXv_int3[0] = A483ForColNum ;
            GXv_int7[0] = A831TipColCod ;
            GXv_char2[0] = GXt_char1 ;
            new app.pcolcl5(remoteHandle, context).execute( GXv_char8, GXv_int6, GXv_char5, GXv_char4, GXv_int3, GXv_int7, GXv_char2) ;
            datotcformu.this.A396EmprCod = GXv_char8[0] ;
            datotcformu.this.A252CliCod = GXv_int6[0] ;
            datotcformu.this.A494ForSer = GXv_char5[0] ;
            datotcformu.this.A482ForColNom = GXv_char4[0] ;
            datotcformu.this.A483ForColNum = GXv_int3[0] ;
            datotcformu.this.A831TipColCod = GXv_int7[0] ;
            datotcformu.this.GXt_char1 = GXv_char2[0] ;
            AV73ForTonal = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = datotcformu.this.AV11ForColNum;
      this.aP5[0] = datotcformu.this.AV12TipColCod;
      this.aP6[0] = datotcformu.this.AV65ForNumcli;
      this.aP7[0] = datotcformu.this.AV64ForNomcli;
      this.aP8[0] = datotcformu.this.AV73ForTonal;
      this.aP9[0] = datotcformu.this.AV74Encontrado;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV64ForNomcli = "" ;
      AV73ForTonal = "" ;
      scmdbuf = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A396EmprCod = "" ;
      P086Z2_A831TipColCod = new byte[1] ;
      P086Z2_A1192ForNumCli = new int[1] ;
      P086Z2_n1192ForNumCli = new boolean[] {false} ;
      P086Z2_A483ForColNum = new int[1] ;
      P086Z2_A1191ForNomCli = new String[] {""} ;
      P086Z2_n1191ForNomCli = new boolean[] {false} ;
      P086Z2_A482ForColNom = new String[] {""} ;
      P086Z2_A494ForSer = new String[] {""} ;
      P086Z2_A252CliCod = new int[1] ;
      P086Z2_A396EmprCod = new String[] {""} ;
      A494ForSer = "" ;
      P086Z3_A831TipColCod = new byte[1] ;
      P086Z3_A483ForColNum = new int[1] ;
      P086Z3_A482ForColNom = new String[] {""} ;
      P086Z3_A494ForSer = new String[] {""} ;
      P086Z3_A252CliCod = new int[1] ;
      P086Z3_A396EmprCod = new String[] {""} ;
      P086Z3_A1192ForNumCli = new int[1] ;
      P086Z3_n1192ForNumCli = new boolean[] {false} ;
      P086Z3_A1191ForNomCli = new String[] {""} ;
      P086Z3_n1191ForNomCli = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char8 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datotcformu__default(),
         new Object[] {
             new Object[] {
            P086Z2_A831TipColCod, P086Z2_A1192ForNumCli, P086Z2_n1192ForNumCli, P086Z2_A483ForColNum, P086Z2_A1191ForNomCli, P086Z2_n1191ForNomCli, P086Z2_A482ForColNom, P086Z2_A494ForSer, P086Z2_A252CliCod, P086Z2_A396EmprCod
            }
            , new Object[] {
            P086Z3_A831TipColCod, P086Z3_A483ForColNum, P086Z3_A482ForColNom, P086Z3_A494ForSer, P086Z3_A252CliCod, P086Z3_A396EmprCod, P086Z3_A1192ForNumCli, P086Z3_n1192ForNumCli, P086Z3_A1191ForNomCli, P086Z3_n1191ForNomCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int AV65ForNumcli ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A252CliCod ;
   private int GXv_int6[] ;
   private int GXv_int3[] ;
   private String AV62EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String AV64ForNomcli ;
   private String AV73ForTonal ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String GXt_char1 ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private boolean AV74Encontrado ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean[] aP9 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P086Z2_A831TipColCod ;
   private int[] P086Z2_A1192ForNumCli ;
   private boolean[] P086Z2_n1192ForNumCli ;
   private int[] P086Z2_A483ForColNum ;
   private String[] P086Z2_A1191ForNomCli ;
   private boolean[] P086Z2_n1191ForNomCli ;
   private String[] P086Z2_A482ForColNom ;
   private String[] P086Z2_A494ForSer ;
   private int[] P086Z2_A252CliCod ;
   private String[] P086Z2_A396EmprCod ;
   private byte[] P086Z3_A831TipColCod ;
   private int[] P086Z3_A483ForColNum ;
   private String[] P086Z3_A482ForColNom ;
   private String[] P086Z3_A494ForSer ;
   private int[] P086Z3_A252CliCod ;
   private String[] P086Z3_A396EmprCod ;
   private int[] P086Z3_A1192ForNumCli ;
   private boolean[] P086Z3_n1192ForNumCli ;
   private String[] P086Z3_A1191ForNomCli ;
   private boolean[] P086Z3_n1191ForNomCli ;
}

final  class datotcformu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV11ForColNum ,
                                          byte AV12TipColCod ,
                                          int A483ForColNum ,
                                          int A1192ForNumCli ,
                                          byte A831TipColCod ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          String AV62EmprCod ,
                                          int AV8CliCod ,
                                          String AV9ForSer ,
                                          String AV10ForColNom ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[6];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT TipColCod, ForNumCli, ForColNum, ForNomCli, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and ForSer >= ? and ForColNom = ?)");
      addWhere(sWhereString, "(ForColNom = ForNomCli)");
      if ( ! (0==AV11ForColNum) )
      {
         addWhere(sWhereString, "(ForColNum = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (0==AV11ForColNum) )
      {
         addWhere(sWhereString, "(ForColNum = ForNumCli)");
      }
      if ( ! (0==AV12TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P086Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV11ForColNum ,
                                          byte AV12TipColCod ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String AV62EmprCod ,
                                          int AV8CliCod ,
                                          String AV9ForSer ,
                                          String AV10ForColNom ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[6];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCli, ForNomCli FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and ForSer >= ? and ForColNom = ?)");
      if ( ! (0==AV11ForColNum) )
      {
         addWhere(sWhereString, "(ForColNum = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV12TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P086Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_P086Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

