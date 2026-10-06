package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidotdispos", "/app.nwdpalmacentejidotdispos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidotdispos extends GXWebObjectStub
{
   public nwdpalmacentejidotdispos( )
   {
   }

   public nwdpalmacentejidotdispos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidotdispos.class ));
   }

   public nwdpalmacentejidotdispos( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidotdispos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidotdispos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido TDISPOS";
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

