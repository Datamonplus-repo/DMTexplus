package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn08", "/app.ttrn08"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn08 extends GXWebObjectStub
{
   public ttrn08( )
   {
   }

   public ttrn08( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn08.class ));
   }

   public ttrn08( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn08_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn08_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Copia TDISPAF";
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

