package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidotdisdef", "/app.nwdpalmacentejidotdisdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidotdisdef extends GXWebObjectStub
{
   public nwdpalmacentejidotdisdef( )
   {
   }

   public nwdpalmacentejidotdisdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidotdisdef.class ));
   }

   public nwdpalmacentejidotdisdef( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidotdisdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidotdisdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido TDISDEF";
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

