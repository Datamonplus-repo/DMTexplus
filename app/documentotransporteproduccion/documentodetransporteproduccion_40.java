package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_40", "/app.documentotransporteproduccion.documentodetransporteproduccion_40"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_40 extends GXWebObjectStub
{
   public documentodetransporteproduccion_40( )
   {
   }

   public documentodetransporteproduccion_40( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_40.class ));
   }

   public documentodetransporteproduccion_40( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_40_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_40_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producciones (ins_upd)";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

