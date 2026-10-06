package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxftcom", "/app.tvxftcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxftcom extends GXWebObjectStub
{
   public tvxftcom( )
   {
   }

   public tvxftcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxftcom.class ));
   }

   public tvxftcom( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxftcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxftcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla F.Técnica/Componentes";
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

