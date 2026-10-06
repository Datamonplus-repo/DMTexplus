package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.recalculometrosguiaremessa", "/app.facturacion.recalculometrosguiaremessa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recalculometrosguiaremessa extends GXWebObjectStub
{
   public recalculometrosguiaremessa( )
   {
   }

   public recalculometrosguiaremessa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recalculometrosguiaremessa.class ));
   }

   public recalculometrosguiaremessa( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recalculometrosguiaremessa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recalculometrosguiaremessa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recalculo Metros Guia Remessa";
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

