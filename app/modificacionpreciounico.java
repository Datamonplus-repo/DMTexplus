package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.modificacionpreciounico", "/app.modificacionpreciounico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class modificacionpreciounico extends GXWebObjectStub
{
   public modificacionpreciounico( )
   {
   }

   public modificacionpreciounico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( modificacionpreciounico.class ));
   }

   public modificacionpreciounico( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new modificacionpreciounico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new modificacionpreciounico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Precio Unico";
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

