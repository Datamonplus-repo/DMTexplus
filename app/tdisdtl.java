package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisdtl", "/app.tdisdtl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisdtl extends GXWebObjectStub
{
   public tdisdtl( )
   {
   }

   public tdisdtl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisdtl.class ));
   }

   public tdisdtl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisdtl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisdtl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PEDIDO CON DETALLE PIEZAS, IN RECEPCIONES";
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

