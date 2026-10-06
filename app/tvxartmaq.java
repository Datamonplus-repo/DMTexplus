package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxartmaq", "/app.tvxartmaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxartmaq extends GXWebObjectStub
{
   public tvxartmaq( )
   {
   }

   public tvxartmaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxartmaq.class ));
   }

   public tvxartmaq( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxartmaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxartmaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Artículo/Grupo de Máquinas";
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

