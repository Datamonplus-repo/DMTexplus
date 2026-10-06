package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpregbl", "/app.tpregbl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpregbl extends GXWebObjectStub
{
   public tpregbl( )
   {
   }

   public tpregbl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpregbl.class ));
   }

   public tpregbl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpregbl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpregbl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PREÇO GLOBAL";
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

