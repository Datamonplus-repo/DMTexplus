package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entregasresumencliente_wcexportreport", "/app.entregasresumencliente_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entregasresumencliente_wcexportreport extends GXWebObjectStub
{
   public entregasresumencliente_wcexportreport( )
   {
   }

   public entregasresumencliente_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entregasresumencliente_wcexportreport.class ));
   }

   public entregasresumencliente_wcexportreport( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entregasresumencliente_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entregasresumencliente_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Entregas Resumen de Cliente";
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

