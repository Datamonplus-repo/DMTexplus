package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn09tablafasesprompt", "/app.ttrn09tablafasesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn09tablafasesprompt extends GXWebObjectStub
{
   public ttrn09tablafasesprompt( )
   {
   }

   public ttrn09tablafasesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn09tablafasesprompt.class ));
   }

   public ttrn09tablafasesprompt( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn09tablafasesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn09tablafasesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Fases";
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

