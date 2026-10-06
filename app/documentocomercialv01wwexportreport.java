package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv01wwexportreport", "/app.documentocomercialv01wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv01wwexportreport extends GXWebObjectStub
{
   public documentocomercialv01wwexportreport( )
   {
   }

   public documentocomercialv01wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv01wwexportreport.class ));
   }

   public documentocomercialv01wwexportreport( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv01wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv01wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Documento Comercial (v01)";
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

