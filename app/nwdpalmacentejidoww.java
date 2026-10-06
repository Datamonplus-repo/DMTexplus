package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidoww", "/app.nwdpalmacentejidoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidoww extends GXWebObjectStub
{
   public nwdpalmacentejidoww( )
   {
   }

   public nwdpalmacentejidoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidoww.class ));
   }

   public nwdpalmacentejidoww( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Nw DPAlmacen Tejido";
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

