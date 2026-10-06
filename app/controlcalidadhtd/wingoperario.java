package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wingoperario", "/app.controlcalidadhtd.wingoperario"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wingoperario extends GXWebObjectStub
{
   public wingoperario( )
   {
   }

   public wingoperario( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wingoperario.class ));
   }

   public wingoperario( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wingoperario_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wingoperario_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleção do Operario";
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

