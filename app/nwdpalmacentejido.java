package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejido", "/app.nwdpalmacentejido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejido extends GXWebObjectStub
{
   public nwdpalmacentejido( )
   {
   }

   public nwdpalmacentejido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejido.class ));
   }

   public nwdpalmacentejido( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido";
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

